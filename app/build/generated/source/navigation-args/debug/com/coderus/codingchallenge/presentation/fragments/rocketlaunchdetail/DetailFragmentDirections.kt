package com.coderus.codingchallenge.presentation.fragments.rocketlaunchdetail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.coderus.codingchallenge.R

public class DetailFragmentDirections private constructor() {
  public companion object {
    public fun actionDetailFragmentToListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailFragment_to_listFragment)
  }
}
