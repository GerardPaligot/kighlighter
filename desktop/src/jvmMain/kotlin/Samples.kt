const val kotlinSample = """
// Inline doc
class Test {
    fun foo() {}
}

/**
 * Kdocs
 */
fun foo(param: Int): String {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    return result
}

/*
 * Multiline doc
 */
@Preview
@Composable(value = "")
fun ComposableFunction() {
}

@Preview
@Composable
fun Testing(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF2b2b2b))
    ) {
        Text(
            text = buildAnnotatedString {
                (
                        function.analyze(code, Color(0xFFFFC660)) +
                                keywords.analyze(code, Color(0xFFCC7832)) +
                                operators.analyze(code, Color.Unspecified) +
                                number.analyze(code, Color(0xFF6897BB)) +
                                rawStrings.analyze(code, Color(0xFF6A8759)) +
                                annotations.analyze(code, Color(0xFFBBB529)) +
                                comments.analyze(code, Color(0xFF808080))
                        )
                    .sortedBy { it.range.first }
                    .fill(code.length)
                    .forEach {
                        withStyle(style = SpanStyle(it.color)) {
                            append(code.substring(it.range))
                        }
                        // val test = append("[$\{it.range}]")
                    }
            },
            color = Color(0xFFA9B7C6)
        )
    }
}

fun Regex.analyze(snippet: String, color: Color): List<SnippetRange> {
    return findAll(snippet).map { SnippetRange(it.groups[1]!!.range, color) }.toList()
}

data class SnippetRange(
    val range: IntRange,
    val color: Color = Color.Unspecified
)
"""
const val xmlSample = """<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Ma page de test</title>
  </head>
  <body>
    <!-- A sample comment -->
    <img src="images/firefox-icon.png" alt="Mon image de test">
  </body>
</html>
"""
