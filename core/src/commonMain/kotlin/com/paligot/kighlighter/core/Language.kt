package com.paligot.kighlighter.core

interface Language<T : ColorScheme> {
    val colorScheme: T
    fun patterns(): List<LanguagePattern<T>>
}