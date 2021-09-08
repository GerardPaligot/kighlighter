import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.paligot.kighlighter.components.kotlin.Kotlin
import com.paligot.kighlighter.components.xml.Xml
import com.paligot.kighlighter.compose.Kighlighter
import com.paligot.kighlighter.palettes.Palettes

fun main() = Window {
    Kighlighter(
        snippet = xmlSample,
        language = Xml(palette = Palettes.Prism),
        modifier = Modifier.height(300.dp)
    )
}



@Preview
@Composable
fun KighlighterPreview() {
    Kighlighter(
        snippet = kotlinSample,
        language = Kotlin(palette = Palettes.Darcula),
    )
}

