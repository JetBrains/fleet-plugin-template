module fleet.sample.workspace {
    requires fleet.kernel;
    requires fleet.run.common;
    requires io.ktor.client.cio;
    requires fleet.sample.common;
    requires io.ktor.client.core;

    exports fleet.sample.workspace;
}