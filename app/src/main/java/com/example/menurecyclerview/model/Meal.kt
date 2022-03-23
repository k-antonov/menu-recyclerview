package com.example.menurecyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Meal(
    @StringRes val name: Int,
    @DrawableRes val image: Int,
    val weight: Int,
    val cost: Double // probably it is not the best idea to store currency data in double,
                     // but I'm using it for demonstration purposes only
) {
    companion object {
        const val SMALL = 220
        const val MEDIUM = 270
        const val LARGE = 350
    }
}