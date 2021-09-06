package com.paligot.kighlighter.core

interface ColorScheme {
    val background: Color
    val contentColor: Color
}

data class Color(val red: Int, val green: Int, val blue: Int)
fun rgb(red: Int, green: Int, blue: Int) = Color(red, green, blue)
