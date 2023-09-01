plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.fleet-plugin") version "0.2.87"
}

repositories {
    mavenCentral()
    // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
}

version = "0.1.0"

// Want to know more about the `fleetPlugin` DSL?
// Read the documentation here (for JetBrains internal use only for now)
// https://jetbrains.team/p/ij/repositories/intellij/files/fleet/gradle-plugin/README.md#dsl
fleetPlugin {
    id = "my.super.plugin"

    metadata {
        readableName = "<choose a unique readable name for your plugin>"
        description = "<add what your plugin is doing>"
    }

    publishing {
        vendorId = "<put your vendor id string here>"
    }

    fleetRuntime {
        version = "1.23.59"
    }

    // to declare external dependency or configuration on layers, you can use
    // layers {
    //     frontendImpl {
    //         dependencies {
    //             api("my-cool:external-dependency:1.0.0")
    //         }
    //     }
    // }
}
