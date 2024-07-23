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
        newTheme(ThemeId(ident = "example-blue-background-tint"))
        newTheme(ThemeId(ident = "example-green-tab-colors"))
        newTheme(ThemeId(ident = "example-high-contrast-text"))
        newTheme(ThemeId(ident = "example-no-syntax-highlighting"))
    }
}
