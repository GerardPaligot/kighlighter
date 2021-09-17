package com.paligot.kighlighter.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
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
fun <T : ColorScheme> Kighlighter(
    snippet: String,
    language: Language<T>,
    modifier: Modifier = Modifier,
    linesHighlighted: List<Int> = emptyList(),
    textStyle: TextStyle = KTypography.jetbrainsMono.body2,
    paddingValues: PaddingValues = PaddingValues(horizontal = 8.dp)
) {
    val ranges by produceState(emptyList<SnippetRange>()) {
        value = com.paligot.kighlighter.Kighlighter(language).apply(snippet)
    }
    var linesHighlightedConfig by remember { mutableStateOf(emptyList<LineHighlighted>()) }
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(language.colorScheme.background.toComposeColor()),
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
                color = language.colorScheme.contentColor.toComposeColor(),
                style = textStyle,
                modifier = Modifier.fillMaxWidth().drawBehind {
                    linesHighlightedConfig.forEach {
                        drawRect(
                            color = language.colorScheme.highlighted.toComposeColor(),
                            topLeft = Offset(0f, it.height - it.lineHeight),
                            size = Size(this.size.width, it.lineHeight)
                        )
                    }
                },
                onTextLayout = { textLayoutResult ->
                    if (linesHighlighted.isNotEmpty()) {
                        val list = arrayListOf<LineHighlighted>()
                        val linesHeight = (0 until textLayoutResult.multiParagraph.lineCount)
                            .map { textLayoutResult.multiParagraph.getLineHeight(it) }
                        var sum = 0.toFloat()
                        val max = linesHighlighted.maxOrNull() ?: 0
                        for ((index, lineHeight) in linesHeight.withIndex()) {
                            val line = index + 1
                            if (max < line) break
                            sum += lineHeight
                            if (linesHighlighted.contains(line)) list.add(LineHighlighted(sum, lineHeight))
                        }
                        linesHighlightedConfig = list
                    }
                }
            )
        }
    }
}

internal fun com.paligot.kighlighter.core.Color.toComposeColor(): Color = Color(red, green, blue)
internal data class LineHighlighted(val height: Float, val lineHeight: Float)
