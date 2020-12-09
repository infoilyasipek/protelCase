package com.example.protelcase.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.domain.models.News
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailsFragmentArgs(
  val newsItem: News
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __newsItem : News?
      if (bundle.containsKey("newsItem")) {
        if (Parcelable::class.java.isAssignableFrom(News::class.java) ||
            Serializable::class.java.isAssignableFrom(News::class.java)) {
          __newsItem = bundle.get("newsItem") as News?
        } else {
          throw UnsupportedOperationException(News::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__newsItem == null) {
          throw IllegalArgumentException("Argument \"newsItem\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newsItem\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__newsItem)
    }
  }
}
