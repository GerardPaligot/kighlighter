package com.paligot.kighlighter.components.kotlin

import com.paligot.kighlighter.components.kotlin.patterns.*
import com.paligot.kighlighter.core.Language
import com.paligot.kighlighter.core.LanguagePattern

class Kotlin: Language {
    override fun patterns(): List<LanguagePattern> = listOf(
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