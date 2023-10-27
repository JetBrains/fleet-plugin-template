// this can be remove safely, the whole `src/workspaceImpl` is for demo purposes
// if you don't need to declare anything on the workspace side, remove the `src/workspaceImpl` directory
package fleet.sample.workspaceImpl

import fleet.kernel.plugins.*
import fleet.util.logging.logger

class MyWorkspacePlugin : Plugin<API> {
    companion object : Plugin.Key<API> {
        val logger = logger<MyWorkspacePlugin>()
    }

    override val key: Plugin.Key<API> = MyWorkspacePlugin

    override fun ContributionScope.load(pluginScope: PluginScope): API = API().also {
        // register workspace-related things here, and remove the dummy log line
        logger.info { "loading stuff of MyWorkspacePlugin" }
    }
}
