package com.paligot.kighlighter.components.xml.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.PrismColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class PrismColorScheme(private val prism: PrismColorPalette): XmlColorScheme {
    override val background: Color
        get() = prism.white
    override val contentColor: Color
        get() = prism.black
    override val attributes: Color
        get() = prism.green
    override val comments: Color
        get() = prism.grey
    override val elements: Color
        get() = prism.pink
    override val strings: Color
        get() = prism.blue
}