package com.paligot.kighlighter.components.xml.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme

interface XmlColorScheme: ColorScheme {
    val attributes: Color
    val comments: Color
    val elements: Color
    val strings: Color
}