package com.paligot.kighlighter.components.kotlin.patterns

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

object NumbersPattern: LanguagePattern {
    override val pattern: Regex
        get() = "\\b(0[xX][\\da-fA-F]+(?:_[\\da-fA-F]+)*|0[bB][01]+(?:_[01]+)*|\\d+(?:_\\d+)*(?:\\.\\d+(?:_\\d+)*)?(?:[eE][+-]?\\d+(?:_\\d+)*)?[fFL]?)\\b".toRegex()

    override fun color(colorScheme: ColorScheme): Color = colorScheme.numbers
}