package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object StringsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "(\"[\\s\\S]*?\"|(?:\"\"\"|''')[\\s\\S]*?(?:\"\"\"|'''))".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.strings
}