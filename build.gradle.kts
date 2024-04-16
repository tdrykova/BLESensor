buildscript {
//    ext {
//        compose_version = "1.1.0-beta01"
//    }
//    dependencies {
//        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
//    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.jetbrains.kotlin.android) apply false
//    id("com.android.application") version "7.2.2" apply false
//    id("com.android.library") version "7.2.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.5.31" apply false

    id("com.google.dagger.hilt.android") version "2.44" apply false
//    id("com.google.dagger.hilt.android") version "2.43.2" apply false

    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}