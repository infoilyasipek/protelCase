package com.example.protelcase.util.extensions

import android.view.View
import android.view.WindowInsets
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.protelcase.util.Constants

fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.gone(){
    this.visibility = View.GONE
}


fun Fragment.isNetworkAvailable(): Boolean {
    return Constants.Functions.isNetworkAvailable(requireContext())
}

fun Fragment.toast(s: String) {
    Toast.makeText(requireContext(), s, Toast.LENGTH_SHORT).show()
}
