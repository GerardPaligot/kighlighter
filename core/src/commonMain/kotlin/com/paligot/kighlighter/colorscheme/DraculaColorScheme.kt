package com.paligot.kighlighter.colorscheme

import com.paligot.kighlighter.core.Color
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.rgb

object DraculaColorScheme : ColorScheme {
    override val background: Color
        get() = rgb(43, 43, 43)
    override val contentColor: Color
        get() = rgb(169, 183, 198)
    override val comments: Color
        get() = rgb(128, 128, 128)
    override val invocations: Color
        get() = rgb(255, 198, 96)
    override val functions: Color
        get() = rgb(255, 198, 96)
    override val keywords: Color
        get() = rgb(204, 120, 50)
    override val operators: Color
        get() = contentColor
    override val numbers: Color
        get() = rgb(104, 151, 187)
    override val strings: Color
        get() = rgb(106, 135, 89)
    override val annotations: Color
        get() = rgb(187, 181, 41)
}
