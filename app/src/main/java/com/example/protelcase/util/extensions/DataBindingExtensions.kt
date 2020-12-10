package com.example.protelcase.util.extensions

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter

import com.bumptech.glide.Glide
import com.example.protelcase.R

@BindingAdapter("isVisible")
fun View.isVisible(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("imageUrl")
fun ImageView.imageUrl(imageUrl: String?) {
    Glide.with(context)
        .load(imageUrl)
        .placeholder(R.color.grey)
        .error(R.color.grey)
        .into(this)
}
