package com.paligot.kighlighter.components.kotlin.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.DraculaColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class DraculaColorScheme(private val dracula: DraculaColorPalette) : KotlinColorScheme {
    override val background: Color
        get() = dracula.black
    override val contentColor: Color
        get() = dracula.greyLight
    override val comments: Color
        get() = dracula.grey
    override val invocations: Color
        get() = dracula.yellow
    override val functions: Color
        get() = dracula.yellow
    override val keywords: Color
        get() = dracula.orange
    override val operators: Color
        get() = contentColor
    override val numbers: Color
        get() = dracula.blue
    override val strings: Color
        get() = dracula.green
    override val annotations: Color
        get() = dracula.khaki
}
