package com.paligot.kighlighter.core

actual fun <T : ColorScheme> LanguagePattern<T>.findAllSnippetRanges(snippet: String, colorScheme: T): Sequence<SnippetRange> =
    pattern.findAll(snippet)
        .filter { it.groups.isNotEmpty() && it.groups[1] != null }
        .map { SnippetRange(it.groups[1]!!.range, this.color(colorScheme)) }
