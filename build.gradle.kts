plugins {
    idea
    `kotlin-dsl`
    id("com.adarshr.test-logger") version "3.2.0"
}

repositories {
    gradlePluginPortal()
}

idea {
    module {
        isDownloadSources = true
    }
}

dependencies {
    implementation("gradle.plugin.at.zierler:yaml-validator-plugin:1.5.0")
    implementation("io.micronaut.gradle:micronaut-gradle-plugin:3.4.1")

    testImplementation(gradleTestKit())
    testImplementation("io.kotest:kotest-assertions-core:5.3.0")
    testImplementation("io.kotest:kotest-runner-junit5:5.3.0")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
