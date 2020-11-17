package com.example.protelcase.data.model

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize
import paperparcel.PaperParcel
import paperparcel.PaperParcelable

@Entity(primaryKeys = ["title","publishedAt"])
@PaperParcel
data class News(
    val title: String,
    val description: String?,
    val author: String?,
    val url: String,
    val urlToImage: String?,
    val content: String?,
    val publishedAt: String,
    val source: Source,
): PaperParcelable{


    companion object{
        @JvmField
        val CREATOR = PaperParcelNews.CREATOR

    }


    @PaperParcel
    @SuppressLint("ParcelCreator")
    data class Source(val id: String?,val name: String): PaperParcelable{
        companion object{
            @JvmField
            val CREATOR = PaperParcelNews_Source.CREATOR

        }

    }
}

