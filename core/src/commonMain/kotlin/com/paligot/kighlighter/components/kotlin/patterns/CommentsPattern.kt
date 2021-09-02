package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object CommentsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "(//.*|(?s)/\\*.*?\\*/)".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.comments
}