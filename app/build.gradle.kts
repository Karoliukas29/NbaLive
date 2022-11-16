import java.util.*
plugins {
    id(AppConfig.androidApplication)
    id(AppConfig.androidKotlin)
    kotlin("kapt") version "1.3.70"
    id(AppConfig.hiltPlugin)
    id(AppConfig.googleServicesPlugin)
    id(AppConfig.navigationArgsPlugin)
    id(AppConfig.kotlinParcelizePlugin)
}


android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode =
            AppConfig.versionMajor * 100 + AppConfig.versionMinor * 10 + AppConfig.versionPatch
        versionName =
            "${AppConfig.versionMajor}.${AppConfig.versionMinor}.${AppConfig.versionPatch}"
        setProperty("archivesBaseName", "Akelius-v$versionName")
        buildConfigField("String", "FILE_PROVIDER_AUTHORITY", "\"APPLICATION_ID.file_provider\"")
        buildConfigField("String", "API_BASE_URL", "\"http://77.71.26.41:8686/\"")
        buildConfigField("String", "DATABASE_NAME", "\"AkeliusApp\"")
        buildConfigField("int",    "DATABASE_VERSION", "2")
        testInstrumentationRunner = AppConfig.androidTestInstrumentation

    }

    viewBinding {
        android.buildFeatures.viewBinding = true
    }

    packagingOptions {
        resources.excludes.add("META-INF/notice.txt")
        resources.merges.add("META-INF/LICENSE")
        resources.merges.add("META-INF/AL2.0")
        resources.merges.add("META-INF/LGPL2.1")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kapt {
        correctErrorTypes = true

        javacOptions {
            // These options are normally set automatically via the Hilt Gradle plugin, but we
            // set them manually to workaround a bug in the Kotlin 1.5.20
            option("-Adagger.fastInit=ENABLED")
            option("-Adagger.hilt.android.internal.disableAndroidSuperclassValidation=true")
        }
    }
}

dependencies {
    implementation(AppDependencies.appLibraries)
    implementation(AppDependencies.networkingLibraries)
    implementation(AppDependencies.hiltLibraries)
    implementation(AppDependencies.navigator)
    implementation(AppDependencies.lifecycleLibraries)
    implementation(AppDependencies.roomLibraries)
    implementation(AppDependencies.firebaseLibraries)
    kapt(AppDependencies.compilerLibraries)
    testImplementation(AppDependencies.testLibraries)
    androidTestImplementation(AppDependencies.androidTestLibraries)
}
