package com.paligot.kighlighter.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.paligot.kighlighter.compose.theme.KTypography
import com.paligot.kighlighter.core.ColorScheme
import com.paligot.kighlighter.core.Language
import com.paligot.kighlighter.core.SnippetRange

@Composable
fun Kighlighter(
    snippet: String,
    language: Language,
    colorScheme: ColorScheme,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = KTypography.jetbrainsMono.body2,
    paddingValues: PaddingValues = PaddingValues(horizontal = 8.dp)
) {
    val ranges by produceState(emptyList<SnippetRange>()) {
        value = com.paligot.kighlighter.Kighlighter(language, colorScheme).apply(snippet)
    }
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(colorScheme.background.toComposeColor()),
        contentPadding = paddingValues
    ) {
        item {
            Text(
                text = buildAnnotatedString {
                    if (ranges.isEmpty()) {
                        append(snippet)
                    } else {
                        ranges.forEach {
                            withStyle(style = SpanStyle(it.color.toComposeColor())) {
                                append(snippet.substring(it.range))
                            }
                        }
                    }
                },
                color = colorScheme.contentColor.toComposeColor(),
                style = textStyle
            )
        }
    }
}

fun com.paligot.kighlighter.core.Color.toComposeColor(): Color = Color(red, green, blue)
