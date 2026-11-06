// build.gradle.kts (raíz del proyecto): aquí los plugins solo se DECLARAN
plugins {
    alias(libs.plugins.android.application) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}
