package com.paligot.kighlighter.core

actual fun LanguagePattern.findAllSnippetRanges(snippet: String, colorScheme: ColorScheme): Sequence<SnippetRange> =
    pattern.findAll(snippet).map { SnippetRange(it.groups[1]!!.range, this.color(colorScheme)) }
