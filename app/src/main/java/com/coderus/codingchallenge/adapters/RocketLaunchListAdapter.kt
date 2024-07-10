package com.coderus.codingchallenge.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.coderus.codingchallenge.data.local.RocketLaunch
import com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.ListItemView

/**
 * ListAdapter class for the Recycler view that displays a list of [RocketLaunch] objects.
 */
class RocketLaunchListAdapter internal constructor(private val context: Context) :
    ListAdapter<RocketLaunch, RocketLaunchListAdapter.ListItemViewHolder>(
        RocketLaunchListDiffCallback()
    ) {

    inner class ListItemViewHolder(val listItemView: ListItemView) :
        RecyclerView.ViewHolder(listItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(ListItemView(context))
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.listItemView.setItem(item)
        holder.listItemView.setOnClickListener { onItemClickListener?.let { it(item) }}
    }

    private var onItemClickListener: ((RocketLaunch) -> Unit)? = null

    // Allows us to manage the click events outside the adapter
    fun setupOnClickListener(listener: (RocketLaunch) -> Unit){
        onItemClickListener = listener
    }
}
