package com.example.protelcase.util

import android.content.Context
import android.content.SharedPreferences

object SharedPrefsHelper{
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences("case_prefs",
            Context.MODE_PRIVATE)
    }

    fun getPrefs(): SharedPreferences {
        return preferences
    }


}