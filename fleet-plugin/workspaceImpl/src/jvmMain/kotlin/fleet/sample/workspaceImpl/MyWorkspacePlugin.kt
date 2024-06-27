package fleet.sample.workspaceImpl

import fleet.kernel.plugins.*
import fleet.util.logging.logger

class MyWorkspacePlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit> {
        val logger = logger<MyWorkspacePlugin>()
    }

    override val key: Plugin.Key<Unit> = MyWorkspacePlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        // TODO: register workspace-related things here, and remove the dummy log line
        logger.info { "Loading MyWorkspacePlugin" }
    }
}
