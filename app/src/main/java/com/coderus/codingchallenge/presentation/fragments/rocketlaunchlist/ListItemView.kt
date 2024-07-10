package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist

import android.content.Context
import android.graphics.Color
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.coderus.codingchallenge.R
import com.coderus.codingchallenge.data.local.RocketLaunch

/**
 * Custom view to show a [RocketLaunch] in the list in the list fragment.
 */
class ListItemView(context: Context) : CardView(context) {

    private val missionNameText: TextView
    private val launchSuccessText: TextView

    init {
        inflate(context, R.layout.list_item_view, this)
        val params = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        params.marginStart = 40
        params.marginEnd = 40
        layoutParams = params
        missionNameText = findViewById(R.id.missionNameText)
        launchSuccessText = findViewById(R.id.launchSuccessText)
    }

    fun setItem(listItem: RocketLaunch) {
        missionNameText.text = listItem.name
        if (listItem.success == true) {
            launchSuccessText.text = context.getString(R.string.successful)
            launchSuccessText.setTextColor(Color.GREEN)
        } else {
            launchSuccessText.text = context.getString(R.string.upcoming)
            launchSuccessText.setTextColor(Color.RED)
        }
    }
}
