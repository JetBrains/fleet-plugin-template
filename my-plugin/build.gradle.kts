plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    // id = "your.plugin.id.here"

    // STEP 2: set up the sensible metadata for your plugin
    // metadata {
    //     readableName = "Your plugin name here"
    //     description = "Your plugin description here"
    // }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
