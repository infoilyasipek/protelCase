package com.example.protelcase.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.example.protelcase.data.Resource
import com.example.protelcase.data.model.News
import com.example.protelcase.repository.NewsRepository

class HomeViewModel(private val newsRepository: NewsRepository) : ViewModel() {

    var dateFilter =  MutableLiveData<String>()

    val newsList: LiveData<Resource<List<News>>> = dateFilter.switchMap {
        loadNewsList()
    }

    private fun loadNewsList(): LiveData<Resource<List<News>>>{
        return newsRepository.loadNewsList(dateFilter.value!!)
    }

    fun setDateFilter(dateFilter: String){
        this.dateFilter.value = dateFilter
    }

    fun refresh(){
        dateFilter.value = dateFilter.value
    }

}