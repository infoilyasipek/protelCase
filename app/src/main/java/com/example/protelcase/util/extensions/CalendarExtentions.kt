package com.example.protelcase.util.extensions

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
fun String.toCalendar(formatter: String): Calendar? {
    return Calendar.getInstance().also {
        it.time = SimpleDateFormat(formatter, Locale.ENGLISH).parse(this)!!
    }
}

@SuppressLint("SimpleDateFormat")
fun Calendar.toString(formatter: String): String {
    return SimpleDateFormat(formatter).format(this.time)
}
