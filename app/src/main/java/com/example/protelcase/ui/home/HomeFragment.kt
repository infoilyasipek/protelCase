package com.example.protelcase.ui.home

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.domain.models.Status
import com.example.protelcase.R
import com.example.protelcase.di.ViewModelFactory
import com.example.protelcase.interfaces.OnItemClickedListener
import com.example.protelcase.util.Constants
import com.example.protelcase.util.extensions.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    companion object {
        private const val TAG = "HomeFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val homeViewModel: HomeViewModel by viewModels {
        viewModelFactory
    }

    private val newsAdapter: NewsAdapter by lazy {
        NewsAdapter(object : OnItemClickedListener {
            override fun onItemClicked(position: Int) {
                findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                                newsAdapter.currentList[position]
                        )
                )
            }
        })
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.setDateFilter(Calendar.getInstance().apply {
            add(Calendar.DATE, -10)
        }.toString(Constants.DATE_FORMAT))

        recyclerViewNews.adapter = newsAdapter
        setupClickListeners()
        setupSwipeToRefresh()
        setupHomeVM()
    }

    private fun setupHomeVM() {
        homeViewModel.newsList.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.SUCCESS -> {
                    Log.d(TAG, "setupHomeVM: success")
                    relativeLayoutError.gone()
                    progressBarLoading.gone()
                    swipeRefreshLayoutNews.isRefreshing = false
                    newsAdapter.submitList(it.data)
                    if (it.data?.isEmpty() == true) {
                        toast("Nothing to show")
                    }
                }
                Status.LOADING -> {
                    Log.d(TAG, "setupHomeVM: loading")
                    relativeLayoutError.gone()
                    if (newsAdapter.currentList.isEmpty()) {
                        progressBarLoading.visible()
                    } else {
                        swipeRefreshLayoutNews.isRefreshing = true
                    }
                }
                Status.ERROR -> {
                    Log.d(TAG, "setupHomeVM: error")
                    progressBarLoading.gone()
                    swipeRefreshLayoutNews.isRefreshing = false
                    if (newsAdapter.currentList.isEmpty()) {
                        relativeLayoutError.visible()
                        if (isNetworkAvailable().not()) {
                            toast("Check your internet connections")
                        }
                    } else {
                        if (isNetworkAvailable().not()) {
                            toast("Check your internet connections")
                        } else {
                            toast("Something went wrong")
                        }
                    }

                }
            }
        }
    }

    private fun setupSwipeToRefresh() {
        swipeRefreshLayoutNews.setOnRefreshListener {
            homeViewModel.refresh()
        }
    }

    private fun setupClickListeners() {
        Log.d(TAG, "setupClickListeners: started.")
        imageViewFilter.setOnClickListener {
            val dateFilter = homeViewModel.dateFilter.value?.toCalendar(Constants.DATE_FORMAT)!!
            DatePickerDialog(
                    requireContext(),
                    { _, year, month, dayOfMonth ->
                        homeViewModel.setDateFilter("$year-${month + 1}-${if (dayOfMonth < 10) "0" else ""}$dayOfMonth")
                    },
                    dateFilter.get(Calendar.YEAR),
                    dateFilter.get(Calendar.MONTH),
                    dateFilter.get(Calendar.DAY_OF_MONTH)
            )
                    .show()
        }

        imageViewRetry.setOnClickListener {
            homeViewModel.refresh()
        }
    }


}