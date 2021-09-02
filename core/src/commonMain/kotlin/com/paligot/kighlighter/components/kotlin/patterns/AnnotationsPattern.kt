package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object AnnotationsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "\\B(@(?:\\w+:)?(?:[A-Z]\\w*|\\[[^\\]]+\\]))".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.annotations
}