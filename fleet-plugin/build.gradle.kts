plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.fleet-plugin") version "0.2.96"
}

repositories {
    mavenCentral()
    // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
}

version = "0.1.0"

// `fleetPlugin` DSL documentation (for JetBrains internal use only until release)
// https://jetbrains.team/p/ij/repositories/intellij/files/fleet/build/fleet-sdk-gradle-plugin/README.md#dsl
fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    // id = "my.super.plugin"

    // STEP 2: set up the mandatory metadata for your plugin
    //
    // metadata {
    //     readableName = "<choose a unique readable name for your plugin>"
    //     description = "<add what your plugin is doing>"
    // }

    fleetRuntime {
        version = "1.23.152"
    }

    // STEP 3 (optional): declare external dependency or configuration on layers
    //
    // layers {
    //     frontendImpl {
    //         dependencies {
    //             api("my-cool:external-dependency:1.0.0")
    //         }
    //     }
    // }
}
