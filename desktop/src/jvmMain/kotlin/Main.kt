import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.paligot.kighlighter.compose.Kighlighter
import com.paligot.kighlighter.colorscheme.DraculaColorScheme
import com.paligot.kighlighter.colorscheme.PrismColorScheme
import com.paligot.kighlighter.components.kotlin.Kotlin

fun main() = Window {
    Kighlighter(
        snippet = code,
        language = Kotlin(),
        colorScheme = DraculaColorScheme,
        modifier = Modifier.height(300.dp)
    )
}



@Preview
@Composable
fun KighlighterPreview() {
    Kighlighter(
        snippet = code,
        language = Kotlin(),
        colorScheme = DraculaColorScheme
    )
}
