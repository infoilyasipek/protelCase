package com.example.data.models

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("status") val status: String,
    @SerializedName("totalResults") val totalResults: Int,
    @SerializedName("articles") val articles: List<NewsItemResponse>
) {

    data class NewsItemResponse(
        @SerializedName("title") val title: String,
        @SerializedName("description") val description: String?,
        @SerializedName("author") val author: String?,
        @SerializedName("url") val url: String,
        @SerializedName("urlToImage") val urlToImage: String?,
        @SerializedName("content") val content: String?,
        @SerializedName("publishedAt") val publishedAt: String,
        @SerializedName("source") val source: Source,
    ) {
        data class Source(@SerializedName("id") val id: String?, @SerializedName("name") val name: String)
    }

}