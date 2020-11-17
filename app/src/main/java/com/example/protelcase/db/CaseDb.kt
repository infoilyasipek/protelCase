package com.example.protelcase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.protelcase.data.model.News

@TypeConverters(ProtelTypeConverter::class)
@Database(
    entities = [
        News::class,
    ],
    version = 1,
    exportSchema = false
)
abstract class CaseDb : RoomDatabase() {


    abstract fun newsDao(): NewsDao

    companion object {
        var INSTANCE: CaseDb? = null

        fun getCaseDb(context: Context): CaseDb? {
            if (INSTANCE == null){
                synchronized(CaseDb::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, CaseDb::class.java, "caseDB").build()
                }
            }
            return INSTANCE
        }
    }

}