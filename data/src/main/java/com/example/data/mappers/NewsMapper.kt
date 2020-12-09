package com.example.data.mappers

import com.example.data.models.NewsResponse
import com.example.domain.models.News
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    fun toNewsList(newsResponse: NewsResponse): List<News> {
        return newsResponse.articles.map {
            News(
                it.title,
                it.description,
                it.author,
                it.url,
                it.urlToImage,
                it.content,
                it.publishedAt,
                News.Source(it.source.id, it.source.name)
            )
        }
    }
}