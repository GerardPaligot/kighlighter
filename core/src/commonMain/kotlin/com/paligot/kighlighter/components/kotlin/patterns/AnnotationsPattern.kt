package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object AnnotationsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "\\B(@(?:\\w+:)?(?:[A-Z]\\w*|\\[[^\\]]+\\]))".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.annotations
}