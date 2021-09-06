package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object FunctionsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "(?:fun +(?:\\w\\.)?)(\\w+)(?=\\s*\\()".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.functions
}