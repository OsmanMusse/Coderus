package com.coderus.codingchallenge.presentation.fragments.rocketlaunchdetail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val rocketdetails: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("rocketdetails", this.rocketdetails)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("rocketdetails", this.rocketdetails)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __rocketdetails : String?
      if (bundle.containsKey("rocketdetails")) {
        __rocketdetails = bundle.getString("rocketdetails")
        if (__rocketdetails == null) {
          throw IllegalArgumentException("Argument \"rocketdetails\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"rocketdetails\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__rocketdetails)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailFragmentArgs {
      val __rocketdetails : String?
      if (savedStateHandle.contains("rocketdetails")) {
        __rocketdetails = savedStateHandle["rocketdetails"]
        if (__rocketdetails == null) {
          throw IllegalArgumentException("Argument \"rocketdetails\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"rocketdetails\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__rocketdetails)
    }
  }
}
