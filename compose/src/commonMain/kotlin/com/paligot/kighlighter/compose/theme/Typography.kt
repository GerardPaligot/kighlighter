package com.paligot.kighlighter.compose.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable

object KTypography {
    val jetbrainsMono: Typography
        @Composable
        get() = Typography(defaultFontFamily = Fonts.jetbrainsMono)
}
