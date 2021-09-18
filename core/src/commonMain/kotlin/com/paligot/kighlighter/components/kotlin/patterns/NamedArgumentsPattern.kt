package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

object NamedArgumentsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "\\([ \t\n]*(\\w+[ \t\n]*=(?![=!&<>/]))[ \t\n]*".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.namedArguments
}