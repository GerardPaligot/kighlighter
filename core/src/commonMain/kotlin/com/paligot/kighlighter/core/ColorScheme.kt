package com.paligot.kighlighter.core

interface ColorScheme {
    val background: Color
    val contentColor: Color
    val comments: Color
    val invocations: Color
    val functions: Color
    val keywords: Color
    val operators: Color
    val numbers: Color
    val strings: Color
    val annotations: Color
}

data class Color(val red: Int, val green: Int, val blue: Int)
fun rgb(red: Int, green: Int, blue: Int) = Color(red, green, blue)
