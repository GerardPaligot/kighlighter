package com.paligot.kighlighter.components.kotlin.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.DarculaColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class DarculaColorScheme(private val darcula: DarculaColorPalette) : KotlinColorScheme {
    override val background: Color
        get() = darcula.black
    override val highlighted: Color
        get() = darcula.blackoff
    override val contentColor: Color
        get() = darcula.greyLight
    override val comments: Color
        get() = darcula.grey
    override val invocations: Color
        get() = darcula.yellow
    override val functions: Color
        get() = darcula.yellow
    override val keywords: Color
        get() = darcula.orange
    override val operators: Color
        get() = contentColor
    override val numbers: Color
        get() = darcula.blue
    override val strings: Color
        get() = darcula.green
    override val annotations: Color
        get() = darcula.khaki
}
