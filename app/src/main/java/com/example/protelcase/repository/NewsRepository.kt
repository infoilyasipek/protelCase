package com.example.protelcase.repository

import androidx.lifecycle.LiveData
import com.example.protelcase.api.ApiResponse
import com.example.protelcase.api.CaseService
import com.example.protelcase.data.Resource
import com.example.protelcase.data.model.News
import com.example.protelcase.data.model.NewsResponse
import com.example.protelcase.db.CaseDb
import com.example.protelcase.util.AppExecutors


class NewsRepository(private val db: CaseDb,val appExecutors: AppExecutors) {
    companion object {
        private const val TAG = "NewsRepository"
    }

    fun loadNewsList(dateFilter: String): LiveData<Resource<List<News>>> {
       return object : NetworkBoundResource<List<News>, NewsResponse>(appExecutors) {
           override fun saveCallResult(item: NewsResponse) {
               appExecutors.diskIO().execute {
                   db.newsDao().insertList(item.articles)
               }
           }

           override fun shouldFetch(data: List<News>?): Boolean {
               return true
           }

           override fun loadFromDb(): LiveData<List<News>> {
               return db.newsDao().loadNewsList(dateFilter)
           }

           override fun createCall(): LiveData<ApiResponse<NewsResponse>> {
               return CaseService.service().fetchNews("football",dateFilter,"publishedAt")
           }

       }.asLiveData()
    }



}