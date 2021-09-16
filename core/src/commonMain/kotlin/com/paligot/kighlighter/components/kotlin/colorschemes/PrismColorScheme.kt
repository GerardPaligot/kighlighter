package com.paligot.kighlighter.components.kotlin.colorschemes

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.palettes.PrismColorPalette
import kotlin.jvm.JvmInline

@JvmInline
internal value class PrismColorScheme(private val prism: PrismColorPalette): KotlinColorScheme {
    override val background: Color
        get() = prism.white
    override val highlighted: Color
        get() = prism.whiteoff
    override val contentColor: Color
        get() = prism.black
    override val comments: Color
        get() = prism.grey
    override val invocations: Color
        get() = prism.pink
    override val functions: Color
        get() = prism.pink
    override val keywords: Color
        get() = prism.blue
    override val operators: Color
        get() = prism.brown
    override val numbers: Color
        get() = prism.pinkDark
    override val strings: Color
        get() = prism.green
    override val annotations: Color
        get() = prism.green
}
