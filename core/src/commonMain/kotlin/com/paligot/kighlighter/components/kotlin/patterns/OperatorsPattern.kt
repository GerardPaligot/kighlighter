package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object OperatorsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "(\\+[+=]?|-[-=>]?|==?=?|!(?:!|==?)?|[/*%<>]={1,2}|[?:]:?|\\.\\.|&&|\\|\\||\\b(?:and|inv|or|shl|shr|ushr|xor)\\b)".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.operators
}