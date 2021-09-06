package com.paligot.kighlighter.core

interface LanguagePattern<T : ColorScheme> {
    val pattern: Regex
    fun color(colorScheme: T): Color
}

expect fun <T : ColorScheme> LanguagePattern<T>.findAllSnippetRanges(snippet: String, colorScheme: T): Sequence<SnippetRange>

fun <T : ColorScheme> LanguagePattern<T>.matches(snippet: String, colorScheme: T): List<SnippetRange> =
    findAllSnippetRanges(snippet, colorScheme).toList()
