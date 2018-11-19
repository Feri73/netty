open module io.netty.resolver {
    requires commons.logging;

    requires transitive io.netty.common;
    exports io.netty.resolver;
}