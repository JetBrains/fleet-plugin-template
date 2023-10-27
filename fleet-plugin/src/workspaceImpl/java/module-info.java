module fleet.sample.workspaceImpl {
    requires fleet.kernel;
    requires fleet.sample.commonImpl;
    requires fleet.util.logging.api;

    exports fleet.sample.workspaceImpl;
    provides fleet.kernel.plugins.Plugin with fleet.sample.workspaceImpl.MyWorkspacePlugin;
}