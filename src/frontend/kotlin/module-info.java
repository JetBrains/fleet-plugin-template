module fleet.sample.frontend {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.noria.ui;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;
    requires fleet.run.common;
    requires fleet.sample.common;

    exports fleet.sample.frontend;
}