package com.paligot.kighlighter.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import com.paligot.kighlighter.compose.Kighlighter
import com.paligot.kighlighter.colorscheme.DraculaColorScheme
import com.paligot.kighlighter.components.kotlin.Kotlin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kighlighter(
                snippet = code,
                language = Kotlin(),
                colorScheme = DraculaColorScheme
            )
        }
    }
}