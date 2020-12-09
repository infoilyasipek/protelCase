package com.example.domain.repositories

import com.example.domain.models.News
import io.reactivex.Single

interface NewsRepository {
    fun getNews(q: String, from: String, sortBy: String): Single<List<News>>
}