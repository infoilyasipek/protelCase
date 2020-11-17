package com.example.protelcase.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.protelcase.data.model.News

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(newsList: List<News>)

    @Query("SELECT * FROM News WHERE publishedAt > :dateFilter")
    fun loadNewsList(dateFilter: String): LiveData<List<News>>

}