package com.paligot.kighlighter.components.kotlin

import com.paligot.kighlighter.components.kotlin.colorschemes.DraculaColorScheme
import com.paligot.kighlighter.components.kotlin.colorschemes.KotlinColorScheme
import com.paligot.kighlighter.components.kotlin.colorschemes.PrismColorScheme
import com.paligot.kighlighter.components.kotlin.patterns.*
import com.paligot.kighlighter.core.Language
import com.paligot.kighlighter.core.LanguagePattern
import com.paligot.kighlighter.palettes.DraculaColorPalette
import com.paligot.kighlighter.palettes.Palette
import com.paligot.kighlighter.palettes.PrismColorPalette

class Kotlin(private val palette: Palette): Language<KotlinColorScheme> {
    override val colorScheme: KotlinColorScheme
        get() = when(palette) {
            is PrismColorPalette -> PrismColorScheme(palette)
            is DraculaColorPalette -> DraculaColorScheme(palette)
        }

    override fun patterns(): List<LanguagePattern<KotlinColorScheme>> = listOf(
        CommentsPattern,
        InvocationsPattern,
        FunctionsPattern,
        KeywordsPattern,
        OperatorsPattern,
        NumbersPattern,
        StringsPattern,
        AnnotationsPattern
    )
}