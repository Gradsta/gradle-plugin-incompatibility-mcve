import io.micronaut.gradle.MicronautExtension

// This works

//plugins {
//    id("io.micronaut.minimal.application")
//}
//
//micronaut {
//    version.set("3.4.1")
//}
//
//repositories {
//    mavenCentral()
//}

// And this works

//plugins {
//    id("at.zierler.yamlvalidator")
//}
//
//repositories {
//    mavenCentral()
//}

// But this does not

plugins {
    id("at.zierler.yamlvalidator")
    id("io.micronaut.minimal.application")
}

configure<MicronautExtension> {
    version.set("3.4.1")
}

repositories {
    mavenCentral()
}
