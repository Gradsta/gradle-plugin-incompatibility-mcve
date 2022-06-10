plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("gradle.plugin.at.zierler:yaml-validator-plugin:1.5.0")
    implementation("io.micronaut.gradle:micronaut-gradle-plugin:3.4.1")
}
