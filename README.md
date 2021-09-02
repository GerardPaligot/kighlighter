# Kighlighter

Simple and extendable code highlighter in Kotlin Multiplatform with 
a composable output to display the code highlighted on Android and 
Desktop. 

## Usage

```kotlin
Kighlighter(
    snippet = yourCode,
    language = Kotlin(),
    colorScheme = DraculaColorScheme,
    modifier = Modifier.height(300.dp)
)
```

## Customization

### Language

If your language isn't available in the library, you can create your
own language in your project or make a pull request. You just need 
to create a new class which extends `Language` interface and create an 
object for each highlighted code concept.

### ColorScheme

If you want your own theme for the highlighted code, you can create 
a color scheme object with the `ColorScheme` interface to specify
rgb colors for all concept supported by the library.

## Download

Not yet available on Maven Central.

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