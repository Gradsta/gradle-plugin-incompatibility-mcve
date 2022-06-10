// This works

//plugins {
//    id("io.micronaut.minimal.application")
//}
//
//micronaut {
//    version.set("3.4.1")
//}

// And this works

//plugins {
//    id("at.zierler.yamlvalidator")
//}

// But this does not

plugins {
    id("at.zierler.yamlvalidator")
    id("io.micronaut.minimal.application")
}

micronaut {
    version.set("3.4.1")
}

