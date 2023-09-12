rootProject.name = "fleet-plugin-template"
include("fleet-plugin")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
        maven {
            url = uri("https://packages.jetbrains.team/maven/p/fleet/fleet-sdk")
            // only needed until the plugin is public
            credentials {
                username = settings.providers.gradleProperty("spaceUsername").orNull
                password = settings.providers.gradleProperty("spacePassword").orNull
            }
        }
    }
}
