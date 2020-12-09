package com.example.protelcase.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.domain.models.News
import com.example.protelcase.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    val newsItem: News
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_detailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(News::class.java)) {
        result.putParcelable("newsItem", this.newsItem as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(News::class.java)) {
        result.putSerializable("newsItem", this.newsItem as Serializable)
      } else {
        throw UnsupportedOperationException(News::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionHomeFragmentToDetailsFragment(newsItem: News): NavDirections =
        ActionHomeFragmentToDetailsFragment(newsItem)
  }
}
