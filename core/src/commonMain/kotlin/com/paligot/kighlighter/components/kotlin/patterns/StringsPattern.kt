package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object StringsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "(\"[\\s\\S]*?\"|(?:\"\"\"|''')[\\s\\S]*?(?:\"\"\"|'''))".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.strings
}