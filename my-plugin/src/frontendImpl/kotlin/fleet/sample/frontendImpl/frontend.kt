// Remove safely if not needed, the whole `src/frontendImpl` is for demo purposes
// if your plugin has no frontend part (which is rare), remove the `src/frontendImpl` directory
package fleet.sample.frontendImpl

import com.jetbrains.rhizomedb.Entrypoint
import fleet.common.settings.SettingsKey
import fleet.common.settings.SettingsLocation
import fleet.common.settings.querySettingsKey
import fleet.frontend.actions.actions
import fleet.frontend.settings.SettingsGroups
import fleet.frontend.settings.settings
import fleet.kernel.ChangeScope
import fleet.kernel.plugins.register
import noria.model.CommonDataKeys
import noria.model.Trigger
import noria.model.buildAction
import noria.windowManagement.extensions.openUrl

@Entrypoint
fun ChangeScope.registerOpenFleetUrlAction() {
    // this is a dummy action and settings registering, do not keep this code
    register {
        actions(
            buildAction(id = OpenFleetActionIds.OpenFleetWebsite.id, "Open Fleet Website") {
                val windowManager = require(CommonDataKeys.WindowManagerActionDataKey)
                trigger(OpenFleetTriggers.OpenFleetWebsite.trigger)
                callback {
                    val url = querySettingsKey(fleetWebsiteLanguageSettingsKey).toUrl()
                    windowManager.value.openUrl(url)
                }
            }
        )

        settings {
            setting(fleetWebsiteLanguageSettingsKey) {
                ui {
                    presentableName = "Fleet website language"
                    group = SettingsGroups.global
                    priority = 1000
                }
            }
        }
    }
}

enum class FleetWebsiteLanguage {
    en, de, es, fr;

    fun toUrl(): String = when (this) {
        en -> "https://www.jetbrains.com/fleet/"
        de -> "https://www.jetbrains.com/de-de/fleet/"
        es -> "https://www.jetbrains.com/es-es/fleet/"
        fr -> "https://www.jetbrains.com/fr-fr/fleet/"
    }
}

val fleetWebsiteLanguageSettingsKey = SettingsKey(
    key = "fleet.website.lang",
    defaultValue = FleetWebsiteLanguage.en,
    supportContexts = false,
    location = SettingsLocation.LOCAL,
)

enum class OpenFleetActionIds(val id: String) {
    OpenFleetWebsite("open-fleet-website"),
}

enum class OpenFleetTriggers(ident: String) {
    OpenFleetWebsite("open-fleet-website");

    val trigger: Trigger = Trigger(ident)
}
