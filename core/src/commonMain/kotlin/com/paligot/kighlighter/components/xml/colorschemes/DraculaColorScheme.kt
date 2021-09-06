package com.paligot.kighlighter.components.xml.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.DraculaColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class DraculaColorScheme(private val dracula: DraculaColorPalette): XmlColorScheme {
    override val background: Color
        get() = dracula.black
    override val contentColor: Color
        get() = dracula.greyLight
    override val attributes: Color
        get() = dracula.orange
    override val comments: Color
        get() = dracula.grey
    override val elements: Color
        get() = dracula.yellow
    override val strings: Color
        get() = dracula.green
}