package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.LanguagePattern

internal object InvocationsPattern: LanguagePattern<KotlinColorScheme> {
    override val pattern: Regex
        get() = "(?:\\b|\\.)((?:\\w+))(?=\\s*(?:\\(|\\{))".toRegex()

    override fun color(colorScheme: KotlinColorScheme): Color = colorScheme.invocations
}