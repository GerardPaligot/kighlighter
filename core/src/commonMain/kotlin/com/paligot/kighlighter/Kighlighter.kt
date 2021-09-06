package com.paligot.kighlighter

import com.paligot.kighlighter.core.*
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

class Kighlighter<T: ColorScheme>(private val language: Language<T>) {
    suspend fun apply(snippet: String) = coroutineScope {
        return@coroutineScope language.patterns()
            .map { pattern -> async { pattern.matches(snippet, language.colorScheme) } }
            .awaitAll()
            .flatten()
            .sortedBy { it.range.first }
            .fillEmptyRanges(snippet.length, language.colorScheme.contentColor)
    }
}
