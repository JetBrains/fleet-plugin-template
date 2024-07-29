plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

repositories {
    it.mavenCentral()
    it.maven("https://cache-redirector.jetbrains.com/intellij-dependencies") // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    // id = "my.sample.plugin"

    // STEP 2: set up the sensible metadata for your plugin
    // metadata {
    //     readableName = "My Sample Plugin"
    //     description = "A sample plugin"
    // }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
