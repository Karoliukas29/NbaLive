pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "7.3.0"
        id("com.android.library") version "7.3.0"
        id("org.jetbrains.kotlin.android") version "1.7.10"
        id("org.jetbrains.kotlin.jvm") version "1.7.10"
        id("org.jetbrains.kotlin.kapt") version "1.6.0-RC2"
        id("org.jetbrains.kotlin.plugin.parcelize") version "1.6.0-M1"
    }

    resolutionStrategy {
        eachPlugin {
            // Use `resolutionStrategy` to define the Hilt plugin and its coordinate
            if (requested.id.id == "dagger.hilt.android.plugin")
                useModule("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
            if (requested.id.id == "androidx.navigation.safeargs")
                useModule("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
            if (requested.id.id == "com.google.gms.google-services")
                useModule("com.google.gms:google-services:4.3.10")

        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "NbaLive"
include(":app")

