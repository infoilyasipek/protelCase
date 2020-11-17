package com.example.protelcase

import android.app.Application
import com.example.protelcase.db.CaseDb
import com.example.protelcase.util.SharedPrefsHelper

class CustomApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPrefsHelper.init(this)

    }

    fun getDatabase(): CaseDb? {
        return CaseDb.getCaseDb(this)
    }
}