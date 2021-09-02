package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object OperatorsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "(\\+[+=]?|-[-=>]?|==?=?|!(?:!|==?)?|[/*%<>]={1,2}|[?:]:?|\\.\\.|&&|\\|\\||\\b(?:and|inv|or|shl|shr|ushr|xor)\\b)".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.operators
}