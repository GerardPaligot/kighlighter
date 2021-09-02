plugins {
    id("org.jetbrains.compose") version "1.0.0-alpha3"
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":compose"))
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.paligot.kighlighter.sample"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}