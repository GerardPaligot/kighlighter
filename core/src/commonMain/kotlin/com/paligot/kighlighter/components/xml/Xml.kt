package com.paligot.kighlighter.components.xml

import com.paligot.kighlighter.components.xml.colorschemes.DarculaColorScheme
import com.paligot.kighlighter.components.xml.colorschemes.PrismColorScheme
import com.paligot.kighlighter.components.xml.colorschemes.XmlColorScheme
import com.paligot.kighlighter.components.xml.patterns.AttributesPattern
import com.paligot.kighlighter.components.xml.patterns.CommentsPattern
import com.paligot.kighlighter.components.xml.patterns.ElementsPattern
import com.paligot.kighlighter.components.xml.patterns.StringsPattern
import com.paligot.kighlighter.core.Language
import com.paligot.kighlighter.core.LanguagePattern
import com.paligot.kighlighter.palettes.DarculaColorPalette
import com.paligot.kighlighter.palettes.Palette
import com.paligot.kighlighter.palettes.PrismColorPalette

class Xml(private val palette: Palette): Language<XmlColorScheme> {
    override val colorScheme: XmlColorScheme
        get() = when(palette) {
            is PrismColorPalette -> PrismColorScheme(palette)
            is DarculaColorPalette -> DarculaColorScheme(palette)
        }

    override fun patterns(): List<LanguagePattern<XmlColorScheme>> = listOf(
        CommentsPattern,
        ElementsPattern,
        AttributesPattern,
        StringsPattern
    )
}