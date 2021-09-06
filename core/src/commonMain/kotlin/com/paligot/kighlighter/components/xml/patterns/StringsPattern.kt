package com.paligot.kighlighter.components.xml.patterns

import com.paligot.kighlighter.components.xml.colorschemes.XmlColorScheme
import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.LanguagePattern

internal object StringsPattern: LanguagePattern<XmlColorScheme> {
    override val pattern: Regex
        get() = "\"([\\s\\S]*?)\"".toRegex()

    override fun color(colorScheme: XmlColorScheme): Color = colorScheme.strings
}