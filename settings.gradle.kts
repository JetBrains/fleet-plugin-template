rootProject.name = "fleet-plugin-template"

include(":fleet-plugin")
include(":fleet-plugin:frontendImpl")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
        maven("https://download.jetbrains.com/teamcity-repository")
        maven {
            url = uri("https://packages.jetbrains.team/maven/p/fleet-plugins-private-preview/fleet-sdk")
            // only needed until the plugin is public
            credentials {
                username = settings.providers.gradleProperty("spaceUsername").orNull
                password = settings.providers.gradleProperty("spacePassword").orNull
            }
        }
    }
}
