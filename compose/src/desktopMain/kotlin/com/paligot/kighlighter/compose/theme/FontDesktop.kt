package com.paligot.kighlighter.compose.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
actual fun Font(res: String, weight: FontWeight, style: FontStyle): Font =
    androidx.compose.ui.text.platform.Font(res, weight, style)
