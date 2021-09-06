package com.paligot.kighlighter.core

actual fun <T : ColorScheme> LanguagePattern<T>.findAllSnippetRanges(snippet: String, colorScheme: T): Sequence<SnippetRange> =
    pattern.findAll(snippet).map { SnippetRange(it.groups[1]!!.range, this.color(colorScheme)) }
