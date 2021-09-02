package com.paligot.kighlighter.colorscheme

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.rgb

object PrismColorScheme: ColorScheme {
    override val background: Color
        get() = rgb(248, 245, 236)
    override val contentColor: Color
        get() = rgb(7, 7, 7)
    override val comments: Color
        get() = rgb(147, 161, 161)
    override val invocations: Color
        get() = rgb(221, 74, 104)
    override val functions: Color
        get() = rgb(221, 74, 104)
    override val keywords: Color
        get() = rgb(0, 119, 170)
    override val operators: Color
        get() = rgb(166, 127, 89)
    override val numbers: Color
        get() = rgb(153, 0, 85)
    override val strings: Color
        get() = rgb(102, 153, 0)
    override val annotations: Color
        get() = rgb(102, 153, 0)
}
