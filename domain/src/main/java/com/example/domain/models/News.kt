package com.example.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val title: String,
    val description: String?,
    val author: String?,
    val url: String,
    val urlToImage: String?,
    val content: String?,
    val publishedAt: String,
    val source: Source,
): Parcelable{
    @Parcelize
    data class Source(val id: String?,val name: String): Parcelable
}

