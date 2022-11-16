import org.gradle.api.artifacts.dsl.DependencyHandler

object AppConfig {
    const val applicationId = "com.example.nbalive"
    const val compileSdk = 33
    const val minSdk = 25
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    const val androidApplication = "com.android.application"
    const val androidKotlin = "org.jetbrains.kotlin.android"
    const val androidLibrary = "com.android.library"
    const val hiltPlugin = "dagger.hilt.android.plugin"
    const val navigationArgsPlugin = "androidx.navigation.safeargs"
    const val googleServicesPlugin = "com.google.gms.google-services"
    const val kotlinParcelizePlugin = "org.jetbrains.kotlin.plugin.parcelize"
    const val versionMajor = 1
    const val versionMinor = 1
    const val versionPatch = 0

}

object Versions {
    const val coreKtxVersion = "1.7.0"
    const val appcompatVersion = "1.3.1"
    const val materialVersion = "1.4.0"
    const val constraintLayoutVersion = "2.1.1"
    const val junitVersion = "4.13.2"
    const val extJunitVersion = "1.1.3"
    const val espressoVersion = "3.4.0"
    const val hiltVersion = "2.41"
    const val coroutinesVersion = "1.3.9"
    const val navigationComponent = "2.3.5"
    const val retrofitVersion = "2.9.0"
    const val okhttpVersion = "4.9.2"
    const val moshiVersion = "1.14.0"
    const val moshiKotlinVersion = "1.14.0"
    const val kotshiVersion = "2.6.3"
    const val multidexVersion = "2.0.1"
    const val datastorePreferenceVersion = "1.0.0"
    const val preferenceVersion = "1.1.1"
    const val recyclerViewVersion = "1.2.1"
    const val recyclerViewDividerVersion = "3.5.0"
    const val glideVersion = "4.10.0"
    const val firebaseBomVersion = "26.2.0"
    const val firebaseCrashlyticsVersion = "18.2.4"
    const val firebaseAnalyticsVersion = "20.0.0"
    const val firebaseMessagingVersion = "23.0.0"
    const val swiperefreshlayoutVersion = "1.1.0"
    const val lifeCycleVersion = "2.4.0"
    const val roomVersion = "2.5.0-beta01"
    const val liveDataVersion = "2.5.1"
}

object AppDependencies {
    private const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    private const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    private const val material = "com.google.android.material:material:${Versions.materialVersion}"
    private const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    private const val hiltAndroid =
        "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    private const val hiltAndroidCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
    private const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    private const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
    private const val navigationUi =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigationComponent}"
    private const val navigationTest =
        "androidx.navigation:navigation-testing:${Versions.navigationComponent}"
    private const val retrofit2 =
        "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    private const val gson =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    private const val retrofitConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    private const val moshi =
        "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    private const val moshiKotlin =
        "com.squareup.moshi:moshi-kotlin:${Versions.moshiKotlinVersion}"
    private const val moshiCodegen =
        "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"
    private const val glideCompiler =
        "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    private const val kotshi =
        "se.ansman.kotshi:api:${Versions.kotshiVersion}"
    private const val kotshiCompiler =
        "se.ansman.kotshi:compiler:${Versions.kotshiVersion}"
    private const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
    private const val okHttpLogging =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpVersion}"
    private const val multidex =
        "androidx.multidex:multidex:${Versions.multidexVersion}"
    private const val recyclerView =
        "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    private const val recyclerViewDivider =
        "com.github.fondesa:recycler-view-divider:${Versions.recyclerViewDividerVersion}"
    private const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayoutVersion}"
    private const val glide =
        "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    private const val preference =
        "androidx.preference:preference-ktx:${Versions.preferenceVersion}"
    private const val datastorePreference =
        "androidx.datastore:datastore-preferences:${Versions.datastorePreferenceVersion}"
    private const val firebaseBom =
        "com.google.firebase:firebase-bom:${Versions.firebaseBomVersion}"
    private const val firebaseMessaging =
        "com.google.firebase:firebase-messaging-ktx:${Versions.firebaseMessagingVersion}"
    private const val firebaseCrashlytics =
        "com.google.firebase:firebase-crashlytics:${Versions.firebaseCrashlyticsVersion}"
    private const val firebaseAnalytics =
        "com.google.firebase:firebase-analytics:${Versions.firebaseAnalyticsVersion}"
    private const val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleVersion}"
    private const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleVersion}"
    private const val lifecycleServices =
        "androidx.lifecycle:lifecycle-service:${Versions.lifeCycleVersion}"
    private const val liveDataServices =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataVersion}"
    private const val roomRunTime = "androidx.room:room-runtime:${Versions.roomVersion}"
    private const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    private const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
    private const val junit = "junit:junit:${Versions.junitVersion}"
    private const val extJUnit = "androidx.test.ext:junit:${Versions.extJunitVersion}"
    private const val espressoCore =
        "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

    val appLibraries = arrayListOf<String>().apply {
        add(coreKtx)
        add(appcompat)
        add(material)
        add(constraintLayout)
        add(coroutinesAndroid)
        add(multidex)
        add(datastorePreference)
        add(preference)
        add(recyclerView)
        add(recyclerViewDivider)
        add(glide)
        add(swiperefreshlayout)
    }

    val lifecycleLibraries = arrayListOf<String>().apply {
        add(lifecycleRuntime)
        add(lifecycleViewModel)
        add(lifecycleServices)
        add(liveDataServices)
    }

    val networkingLibraries = arrayListOf<String>().apply {
        add(retrofit2)
        add(retrofitConverter)
        add(okHttp)
        add(okHttpLogging)
        add(gson)
        add(moshi)
        add(moshiKotlin)
        add(kotshi)
    }

    val roomLibraries = arrayListOf<String>().apply {
        add(roomRunTime)
        add(roomKtx)
    }

    val compilerLibraries = arrayListOf<String>().apply {
        add(moshiCodegen)
        add(kotshiCompiler)
        add(hiltAndroidCompiler)
        add(glideCompiler)
        add(roomCompiler)
    }

    val navigator = arrayListOf<String>().apply {
        add(navigationFragment)
        add(navigationUi)
        add(navigationTest)
    }

    val hiltLibraries = arrayListOf<String>().apply {
        add(hiltAndroid)
    }

    val firebaseLibraries = arrayListOf<String>().apply {
        add(firebaseBom)
        add(firebaseAnalytics)
//        add(firebaseCrashlytics)
        add(firebaseMessaging)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}
