pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "kighlighter"
include(":android")
include(":desktop")
include(":core")
include(":compose")
