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

// `fleetPlugin` DSL documentation (for JetBrains internal use only until release)
// https://jetbrains.team/p/ij/repositories/intellij/files/fleet/build/fleet-sdk-gradle-plugin/README.md#dsl
fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    // id = "my.sample.plugin"

    // STEP 2: set up the sensible metadata for your plugin
    //
    // metadata {
    //     readableName = "<choose a unique readable name for your plugin>"
    //     description = "<add what your plugin is doing>"
    // }

    // STEP 3: see each `build.gradle.kts` of each layer directory `commonImpl/build.gradle.kts`, `frontendImpl/build.gradle.kts`, `workspaceImpl/build.gradle.kts`

    fleetRuntime {
        version = "1.37.56"
    }
}
