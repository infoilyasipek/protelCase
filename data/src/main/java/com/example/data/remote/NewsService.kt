package com.example.data.remote

import com.example.data.models.NewsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsService {

    @GET("everything?apiKey=${Constants.API_KEY}")
    fun getNews(@Query("q") q: String, @Query("from") from: String, @Query("sortBy") sortBy: String): Single<NewsResponse>

}