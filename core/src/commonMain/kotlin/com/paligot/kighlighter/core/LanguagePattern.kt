package com.paligot.kighlighter.core

interface LanguagePattern {
    val pattern: Regex
    fun color(colorScheme: ColorScheme): Color
}

expect fun LanguagePattern.findAllSnippetRanges(snippet: String, colorScheme: ColorScheme): Sequence<SnippetRange>

fun LanguagePattern.matches(snippet: String, colorScheme: ColorScheme): List<SnippetRange> =
    findAllSnippetRanges(snippet, colorScheme).toList()
