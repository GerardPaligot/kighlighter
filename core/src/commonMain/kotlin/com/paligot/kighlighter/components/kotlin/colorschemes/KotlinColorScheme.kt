package com.paligot.kighlighter.components.kotlin.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme

interface KotlinColorScheme: ColorScheme {
    val comments: Color
    val invocations: Color
    val functions: Color
    val keywords: Color
    val operators: Color
    val numbers: Color
    val strings: Color
    val annotations: Color
}