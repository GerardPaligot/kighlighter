package com.paligot.kighlighter

import com.paligot.kighlighter.core.*
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

class Kighlighter(private val language: Language, private val colorScheme: ColorScheme) {
    suspend fun apply(snippet: String) = coroutineScope {
        return@coroutineScope language.patterns()
            .map { pattern -> async { pattern.matches(snippet, colorScheme) } }
            .awaitAll()
            .flatten()
            .sortedBy { it.range.first }
            .fillEmptyRanges(snippet.length, colorScheme.contentColor)
    }
}
