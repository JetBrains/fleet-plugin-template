plugins {
    kotlin("multiplatform")
    id("org.jetbrains.fleet-plugin-layer")
}

// STEP 3 (optional): the `frontendImpl` subproject is for demo purposes, if your plugin has no frontend part (which is rare), remove
// the `frontendImpl` directory entirely and the `include(":fleet-plugin:frontendImpl")` statement in `settings.gradle.kts`

// STEP 4 (optional): declare external dependency or configuration on that layer
//
//kotlin {
//    sourceSets {
//        jvmMain {
//            dependencies {
//                api("my-cool:external-dependency:1.0.0")
//            }
//        }
//    }
//}
