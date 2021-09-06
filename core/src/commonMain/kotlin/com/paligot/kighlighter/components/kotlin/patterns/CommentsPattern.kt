package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object CommentsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "(//.*|(?s)/\\*.*?\\*/)".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.comments
}