# Build your own theme plugin

## Documentations

- [Theme Documentation][TODO]

## Set up your own repository and plugin configuration

1. This repository is a template, create your own repository from it (see [GitHub Docs on how to do it][gh:template])
2. Clone your newly created repository
3. Specify in `fleet-plugin/build.gradle.kts` (you will find commented out value to replace in that file)
    1. your plugin `fleetPlugin.id`
    2. your plugin `fleetPlugin.metadata.readableName`
    3. your plugin `fleetPlugin.metadata.description`

## Run Fleet with your custom theme plugin

A few example themes have been wired in the template for demonstration purposes, let's start Fleet with our custom plugin to check these themes.

### From JetBrains Fleet

1. Open Run dialog
2. Run `Run Fleet with local plugin` Run Configuration

Once Fleet is started, you can use `Color Theme...` action to select your theme and try it out!

### From Terminal

```shell
./gradlew runFleet
```

Once Fleet is started, you can use `Color Theme...` action to select your theme and try it out!

## Build your own theme and register it

Now that you've seen how to run Fleet with our custom plugin, it is time to create our own theme.

In `MyPlugin.kt` you will find the entrypoint of your plugin in which you will see the example themes

To create your own theme:
1. Create a `.json` file in `fleet-plugin/frontendImpl/src/jvmMain/resources/`, e.g. `my-super-theme.json`
2. Declare it in your plugin's code in `MyPlugin.kt` adding a `newTheme(ThemeId(ident = "my-super-theme"))`

> [!IMPORTANT]
> The JSON filename (without `.json` extension) must match `ident`, e.g. here `my-super-plugin` is used to point to the `my-super-plugin.json` resource file.

To know more on how to write the content of the JSON file that describes a Fleet Theme, please follow our [Theme Documentation][TODO].

Feel free to remove the example themes in `fleet-plugin/frontendImpl/src/jvmMain/resources/`, as well as their `newTheme` declarations in `MyPlugin.kt`, you probably only want to distribute your awesome theme!

## Limitations & Tips

- Theme plugins are not reloaded automatically, however, you can use `Edit Color Theme...` to tweak your theme, and then copy the JSON opened in your editor to your `.json` theme file
