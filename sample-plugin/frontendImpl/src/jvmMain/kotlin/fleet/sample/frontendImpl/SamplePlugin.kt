package fleet.sample.frontendImpl

import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class SamplePlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = SamplePlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        // your plugin code here
    }
}
