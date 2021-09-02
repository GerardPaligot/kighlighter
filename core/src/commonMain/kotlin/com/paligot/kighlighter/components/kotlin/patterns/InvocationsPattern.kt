package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object InvocationsPattern: LanguagePattern {
    override val pattern: Regex
        get() = "(?:\\b|\\.)((?:\\w+))(?=\\s*(?:\\(|\\{))".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.invocations
}