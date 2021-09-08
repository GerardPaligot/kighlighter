package com.paligot.kighlighter.components.xml.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.DarculaColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class DarculaColorScheme(private val darcula: DarculaColorPalette): XmlColorScheme {
    override val background: Color
        get() = darcula.black
    override val contentColor: Color
        get() = darcula.greyLight
    override val attributes: Color
        get() = darcula.orange
    override val comments: Color
        get() = darcula.grey
    override val elements: Color
        get() = darcula.yellow
    override val strings: Color
        get() = darcula.green
}