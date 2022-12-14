/*
 * Copyright (c) 2021 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by LGPL v2.1
 */

package tech.antibytes.gradle.project.dependency

object GradlePlugin {
    const val dependency = "tech.antibytes.gradle-plugins:antibytes-dependency:${Version.gradle.antibytes}"
    const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
    const val publishing = "tech.antibytes.gradle-plugins:antibytes-publishing:${Version.gradle.antibytes}"
    const val coverage = "tech.antibytes.gradle-plugins:antibytes-coverage:${Version.gradle.antibytes}"
    const val projectConfig = "tech.antibytes.gradle-plugins:antibytes-configuration:${Version.gradle.antibytes}"
    const val runtimeConfig = "tech.antibytes.gradle-plugins:antibytes-runtime-configuration:${Version.gradle.antibytes}"
    const val spotless = "com.diffplug.spotless:spotless-plugin-gradle:${Version.gradle.spotless}"
    const val kmock = "tech.antibytes.kmock:kmock-gradle:${Version.antibytes.kmock}"
    const val sqldelight = "com.squareup.sqldelight:gradle-plugin:${Version.sqldelight}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Version.google.hilt}"
}
