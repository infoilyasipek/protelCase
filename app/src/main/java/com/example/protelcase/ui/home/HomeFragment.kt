package com.example.protelcase.ui.home

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.protelcase.ui.ViewModelFactory
import com.example.protelcase.R
import com.example.protelcase.data.Status
import com.example.protelcase.interfaces.OnItemClickedListener
import com.example.protelcase.util.Constants
import com.example.protelcase.util.extensions.gone
import com.example.protelcase.util.extensions.visible
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.atomic.AtomicBoolean


class HomeFragment : Fragment() {

    companion object {
        private const val TAG = "HomeFragment"
    }


    private lateinit var adapter: NewsAdapter

    private lateinit var homeViewModel: HomeViewModel

    private var rootView: View? = null
    private var didCreateViewBefore = AtomicBoolean(false)


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_home, container, false)
        }
        return rootView
    }

    override fun getView(): View? {
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (didCreateViewBefore.compareAndSet(false, true)) {
            homeViewModel =
                    ViewModelFactory(requireActivity().application).create(HomeViewModel::class.java)

            homeViewModel.setDateFilter(Calendar.getInstance().apply {
                add(Calendar.DATE, -10)
            }.toString(Constants.DATE_FORMAT))

            adapter = NewsAdapter(object : OnItemClickedListener {
                override fun onItemClicked(position: Int) {
                    findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(adapter.currentList[position]))
                }
            })
            rv_itemsContainer.adapter = adapter

            setupClickListeners()

            setupSwipeToRefresh()
        }

        setupHomeVM()
    }


    private fun setupHomeVM() {

        homeViewModel.newsList.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.SUCCESS -> {
                    Log.d(TAG, "setupHomeVM: success")
                    rl_error.gone()
                    pb_loading.gone()
                    swipeRefreshLayout.isRefreshing = false
                    adapter.submitList(it.data)
                    if (it.data?.isEmpty() == true) {
                        toast("Nothing to show")
                    }
                }
                Status.LOADING -> {
                    Log.d(TAG, "setupHomeVM: loading")
                    rl_error.gone()
                    if (adapter.currentList.isEmpty()) {
                        pb_loading.visible()
                    } else {
                        swipeRefreshLayout.isRefreshing = true
                    }
                }
                Status.ERROR -> {
                    Log.d(TAG, "setupHomeVM: error")
                    pb_loading.gone()
                    swipeRefreshLayout.isRefreshing = false
                    if (adapter.currentList.isEmpty()) {
                        rl_error.visible()
                    } else if (!isNetworkAvailable()) {
                        toast("Check your internet connection")
                    } else {
                        toast("Something went wrong")
                    }
                }
            }
        }
    }

    private fun setupSwipeToRefresh() {
        swipeRefreshLayout.setOnRefreshListener {
            homeViewModel.refresh()
        }
    }

    private fun setupClickListeners() {
        Log.d(TAG, "setupClickListeners: started.")
        iv_filters.setOnClickListener {
            val dateFilter = homeViewModel.dateFilter.value?.toCalendar(Constants.DATE_FORMAT)!!
            DatePickerDialog(requireContext(), { view, year, month, dayOfMonth ->
                homeViewModel.setDateFilter("$year-${month + 1}-${if (dayOfMonth < 10) "0" else ""}$dayOfMonth")
            }, dateFilter.get(Calendar.YEAR), dateFilter.get(Calendar.MONTH), dateFilter.get(Calendar.DAY_OF_MONTH))
                    .show()
        }

        iv_retry.setOnClickListener {
            homeViewModel.refresh()
        }
    }

    private fun Fragment.isNetworkAvailable(): Boolean {
        return Constants.Functions.isNetworkAvailable(requireContext())
    }


    private fun Fragment.toast(s: String) {
        Toast.makeText(requireContext(), s, Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("SimpleDateFormat")
    private fun String.toCalendar(formatter: String): Calendar? {
        return Calendar.getInstance().also {
            it.time = SimpleDateFormat(formatter, Locale.ENGLISH).parse(this)!!
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun Calendar.toString(formatter: String): String {
        return SimpleDateFormat(formatter).format(this.time)
    }


}