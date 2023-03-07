pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
        // remove it after moving the plugin to gradle plugin portal
        maven {
            url = uri("https://packages.jetbrains.team/maven/p/fleet/fleet-sdk")
            credentials {
                username = settings.providers.gradleProperty("spaceUsername").orNull
                password = settings.providers.gradleProperty("spacePassword").orNull
            }
        }
    }
}
