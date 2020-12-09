package com.example.domain.usecases

import com.example.domain.models.News
import com.example.domain.repositories.NewsRepository
import io.reactivex.Single
import javax.inject.Inject


class GetNewsUseCase @Inject constructor(private val newsRepository: NewsRepository){

    fun execute(q: String, from: String, sortBy: String): Single<List<News>> {
        return newsRepository.getNews(q,from,sortBy)
    }

}