// Remove safely if not needed, the whole `src/frontendImpl` is for demo purposes
// if your plugin has no frontend part (which is rare), remove the `src/frontendImpl` directory
package fleet.sample.frontendImpl

import com.jetbrains.rhizomedb.Entrypoint
import fleet.frontend.actions.actions
import fleet.frontend.actions.windowManager
import fleet.kernel.ChangeScope
import fleet.kernel.plugins.register
import noria.model.Action
import noria.model.ActionPresentation
import noria.model.Propagate
import noria.model.Trigger
import noria.windowManagement.extensions.openUrl

@Entrypoint
fun ChangeScope.registerOpenFleetUrlAction() {
    // this is a dummy action registering, do not keep this code
    register {
        actions(
            Action(
                defaultPresentation = ActionPresentation("Open Fleet Website"),
                perform = { ac ->
                    ac.windowManager.openUrl("https://jetbrains.com/fleet")
                    Propagate.STOP
                },
                triggers = setOf(OPEN_FLEET_WEBSITE_TRIGGER),
                identifier = "Register Open Fleet action",
            )
        )
    }
}

private val OPEN_FLEET_WEBSITE_TRIGGER = Trigger("open-fleet-webstite")
