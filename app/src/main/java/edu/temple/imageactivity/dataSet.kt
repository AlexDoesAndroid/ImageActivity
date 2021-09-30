package edu.temple.imageactivity

import android.content.res.Resources
import androidx.annotation.DrawableRes

data class SucculentData(
    val id: Int,
    val name: String,
    @DrawableRes
    val image: Int?
)