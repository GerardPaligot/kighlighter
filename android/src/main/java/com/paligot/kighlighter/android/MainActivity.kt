package com.paligot.kighlighter.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.paligot.kighlighter.components.kotlin.Kotlin
import com.paligot.kighlighter.compose.Kighlighter
import com.paligot.kighlighter.palettes.DarculaColorPalette
import com.paligot.kighlighter.palettes.Palettes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kighlighter(
                snippet = code,
                language = Kotlin(palette = Palettes.Darcula),
                linesHighlighted = arrayListOf(3, 6, 7),
            )
        }
    }
}