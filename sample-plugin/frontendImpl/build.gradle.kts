plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.fleet.plugin.layer)
}

repositories {
    it.mavenCentral()
    it.maven("https://cache-redirector.jetbrains.com/intellij-dependencies") // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
}

kotlin {
    jvmToolchain(17)
}
