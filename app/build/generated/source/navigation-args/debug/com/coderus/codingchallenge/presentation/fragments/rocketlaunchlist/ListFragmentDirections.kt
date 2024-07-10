package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist

import android.os.Bundle
import androidx.navigation.NavDirections
import com.coderus.codingchallenge.R
import kotlin.Int
import kotlin.String

public class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToDetailFragment(
    public val rocketdetails: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_listFragment_to_detailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("rocketdetails", this.rocketdetails)
        return result
      }
  }

  public companion object {
    public fun actionListFragmentToDetailFragment(rocketdetails: String): NavDirections =
        ActionListFragmentToDetailFragment(rocketdetails)
  }
}
