package com.kuloud.dependendencies

object Versions {
    const val minSdk = 21
    const val targetSdk = 30
    const val compileSdk = 30
    const val buildTools = "30.0.2"
}


object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:4.1.1"

    object Kotlin {
        private const val version = "1.4.20"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"

        object Benchmark {
            private const val version = "1.0.0"
            const val plugin = "androidx.benchmark:benchmark-gradle-plugin:$version"
            const val junit4 = "androidx.benchmark:benchmark-junit4:$version"
        }

        object Test {
            const val runner = "androidx.test:runner:1.2.0"
            const val junit = "androidx.test.ext:junit:1.1.1"
        }
    }

    object Material {
        const val material = "com.google.android.material:material:1.2.1"
    }

    object Test {
        const val junit = "junit:junit:4.12"
    }
}
