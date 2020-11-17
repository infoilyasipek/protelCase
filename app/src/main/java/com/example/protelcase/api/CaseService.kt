package com.example.protelcase.api

import com.example.protelcase.util.LiveDataCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CaseService {
    private const val BASE_URL = "https://newsapi.org/v2/"
    fun service() : CaseApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()
            .create(CaseApi::class.java)
    }

}