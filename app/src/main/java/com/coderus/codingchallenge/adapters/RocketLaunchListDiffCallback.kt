package com.coderus.codingchallenge.adapters

import androidx.recyclerview.widget.DiffUtil
import com.coderus.codingchallenge.data.local.RocketLaunch

/**
 * [DiffUtil.ItemCallback] for the [RocketLaunch] list.
 */
class RocketLaunchListDiffCallback : DiffUtil.ItemCallback<RocketLaunch>() {

    override fun areItemsTheSame(oldItem: RocketLaunch, newItem: RocketLaunch) =
        oldItem.flightNumber == newItem.flightNumber

    override fun areContentsTheSame(oldItem: RocketLaunch, newItem: RocketLaunch) =
        oldItem == newItem

}
