package com.example.appwuwo.ui.theme

import android.graphics.Color
import androidx.annotation.DrawableRes

data class Feature(
    val tittle: String,
    @DrawableRes val iconId: Int,
    val lightingColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
    )
