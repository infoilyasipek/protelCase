package com.example.protelcase.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.protelcase.R
import com.example.protelcase.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment(), View.OnClickListener {

    companion object {
        private const val TAG = "DetailsFragment"
    }

    private lateinit var binding: FragmentDetailsBinding
    private val args by navArgs<DetailsFragmentArgs>()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val dataBinding = FragmentDetailsBinding.inflate(inflater, container, false).also {
            it.handler = this
            it.news = args.newsItem
        }
        binding = dataBinding
        return dataBinding.root
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageViewBack -> {
                findNavController().popBackStack()
            }
            R.id.buttonViewMore -> {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(args.newsItem.url)))
            }
        }
    }
}