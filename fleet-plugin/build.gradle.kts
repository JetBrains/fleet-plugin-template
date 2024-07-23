plugins {
    base
    id("org.jetbrains.fleet-plugin")
}

listOf(
    repositories,
    *subprojects.map { it.repositories }.toTypedArray()
).forEach {
    it.mavenCentral()
    it.maven("https://cache-redirector.jetbrains.com/intellij-dependencies") // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    // id = "my.sample.theme"

    // STEP 2: set up the sensible metadata for your plugin
    // metadata {
    //     readableName = "Sample Theme"
    //     description = "Sample Theme Plugin"
    // }

    fleetRuntime {
        version = "1.37.56"
    }
}
