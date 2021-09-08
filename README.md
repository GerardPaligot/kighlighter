# Kighlighter

Simple and extendable code highlighter in Kotlin Multiplatform with 
a composable output to display the code highlighted on Android and 
Desktop. 

## Usage

```kotlin
Kighlighter(
    snippet = yourCode,
    language = Kotlin(palette = Palettes.Darcula),
    modifier = Modifier.height(300.dp)
)
```

## Customization

### ColorScheme

If you don't like any palettes provided by the library, you can create
your own palette, the color scheme of the supported language and provide
the palette when you create the language object.

When you create your palette object, add the sealed interface as interface
of your own palette.

When you create your color scheme value class, add the language color scheme 
interface of your own color scheme (e.g. `KotlinColorScheme`).

Finally, you can give your palette in the language class:

```kotlin
Kotlin(palette = YourOwnPalette)
```

## Download

Release artifacts aren't available yet but if you want to test latest changes merge 
in `main` branch, you can test snapshot artifacts.

```kotlin
repositories {
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

// Android artifact
implementation("com.paligot.kighlighter:kighlighter-compose:1.0.0-SNAPSHOT")
// Desktop artifact
implementation("com.paligot.kighlighter:kighlighter-compose-desktop:1.0.0-SNAPSHOT")
```

## License

    Copyright 2021 Gérard Paligot.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.