package com.example.protelcase.util

import android.content.Context
import android.net.ConnectivityManager

class Constants {
    companion object{

        const val API_KEY = "ae68088e70d04639b4950bdc9d546924"
        const val DATE_FORMAT = "yyyy-MM-dd"
    }

    object Functions {

        fun isNetworkAvailable(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            return activeNetworkInfo != null && activeNetworkInfo.isConnected
        }

    }
}