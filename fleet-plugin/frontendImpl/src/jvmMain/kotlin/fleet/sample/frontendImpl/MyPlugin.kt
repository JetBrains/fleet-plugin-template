package fleet.sample.frontendImpl

import fleet.dock.api.ThemeId
import fleet.frontend.theme.newTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class MyPlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = MyPlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        newTheme(ThemeId(ident = "SampleTheme"))
    }
}
