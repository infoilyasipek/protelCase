package com.example.protelcase.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.protelcase.CustomApplication
import com.example.protelcase.repository.NewsRepository
import com.example.protelcase.ui.home.HomeViewModel
import com.example.protelcase.util.AppExecutors


/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class ViewModelFactory(private val application: Application) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(
                    newsRepository = NewsRepository((application as CustomApplication).getDatabase()!!,AppExecutors)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}