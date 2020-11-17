package com.example.protelcase.db

import androidx.room.TypeConverter
import com.example.protelcase.data.model.News

object ProtelTypeConverter{

    private const val SEPARATOR = "####"
    @TypeConverter
    @JvmStatic
    fun strToSource(data: String): News.Source {
        val s = data.split(SEPARATOR)
        return News.Source(s[0],s[1])
    }

    @TypeConverter
    @JvmStatic
    fun sourceToString(source: News.Source): String{
        return source.id + SEPARATOR + source.name
    }

}