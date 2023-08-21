module fleet.sample.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.noria.ui;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;
    requires fleet.sample.commonImpl;

    exports fleet.sample.frontendImpl;
}