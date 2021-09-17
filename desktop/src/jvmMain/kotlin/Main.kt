import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.paligot.kighlighter.components.kotlin.Kotlin
import com.paligot.kighlighter.compose.Kighlighter
import com.paligot.kighlighter.palettes.Palettes

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Kighlighter(
            snippet = kotlinSample,
            language = Kotlin(palette = Palettes.Prism),
            linesHighlighted = arrayListOf(3, 6, 7),
            modifier = Modifier.height(300.dp)
        )
    }
}



@Preview
@Composable
fun KighlighterPreview() {
    Kighlighter(
        snippet = kotlinSample,
        language = Kotlin(palette = Palettes.Darcula),
    )
}

