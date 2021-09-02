package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object FunctionsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "(?:fun +(?:\\w\\.)?)(\\w+)(?=\\s*\\()".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.functions
}