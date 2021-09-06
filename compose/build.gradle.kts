plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.0.0-alpha3"
    id("com.android.library")
    id("com.vanniktech.maven.publish")
}
kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val androidMain by getting
        val commonMain by getting {
            dependencies {
                api(project(":core"))
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
            }
        }
        val commonTest by getting
        val desktopMain by getting
    }
}

android {
    compileSdkVersion(30)
    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(30)
    }
    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        }
    }
}
