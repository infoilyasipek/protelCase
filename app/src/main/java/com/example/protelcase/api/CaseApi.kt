package com.example.protelcase.api

import androidx.lifecycle.LiveData
import com.example.protelcase.data.model.NewsResponse
import com.example.protelcase.util.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CaseApi {

    @GET("everything?apiKey=${Constants.API_KEY}")
    @Headers("Accept: application/json")
    fun fetchNews(@Query("q") q: String,@Query("from") from: String, @Query("sortBy") sortBy: String): LiveData<ApiResponse<NewsResponse>>

}
