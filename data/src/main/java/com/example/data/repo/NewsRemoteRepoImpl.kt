package com.example.data.repo

import com.example.data.mappers.NewsMapper
import com.example.data.remote.NewsService
import com.example.domain.models.News
import com.example.domain.repositories.NewsRepository
import io.reactivex.Single
import javax.inject.Inject

class NewsRemoteRepoImpl @Inject constructor(private val newsService: NewsService,private val newsMapper: NewsMapper) : NewsRepository {

    override fun getNews(q: String, from: String, sortBy: String): Single<List<News>> {
        return newsService.getNews(q,from,sortBy).map {
            newsMapper.toNewsList(it)
        }
    }
}