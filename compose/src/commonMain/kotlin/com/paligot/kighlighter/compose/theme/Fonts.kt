package com.paligot.kighlighter.compose.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
expect fun Font(res: String, weight: FontWeight, style: FontStyle): Font

object Fonts {
    val jetbrainsMono: FontFamily
        @Composable
        get() = FontFamily(
            Font(
                "font/jetbrainsmono_regular.ttf",
                FontWeight.Normal,
                FontStyle.Normal
            ),
            Font(
                "font/jetbrainsmono_italic.ttf",
                FontWeight.Normal,
                FontStyle.Italic
            ),
            Font(
                "font/jetbrainsmono_bold.ttf",
                FontWeight.Bold,
                FontStyle.Normal
            ),
            Font(
                "font/jetbrainsmono_bold_italic.ttf",
                FontWeight.Bold,
                FontStyle.Italic
            ),
            Font(
                "font/jetbrainsmono_extrabold.ttf",
                FontWeight.ExtraBold,
                FontStyle.Normal
            ),
            Font(
                "font/jetbrainsmono_extrabold_italic.ttf",
                FontWeight.ExtraBold,
                FontStyle.Italic
            ),
            Font(
                "font/jetbrainsmono_medium.ttf",
                FontWeight.Medium,
                FontStyle.Normal
            ),
            Font(
                "font/jetbrainsmono_medium_italic.ttf",
                FontWeight.Medium,
                FontStyle.Italic
            )
        )
}