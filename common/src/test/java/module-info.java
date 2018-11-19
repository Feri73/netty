open module io.netty.common {
    requires jdk.unsupported;
    requires static commons.logging;
    requires static log4j;
    requires static log4j.api;
    requires static slf4j.api;
    requires java.logging;
    requires transitive jctools.core;

    exports io.netty.util;
    exports io.netty.util.internal;
    exports io.netty.util.internal.logging;
    exports io.netty.util.concurrent;
    exports io.netty.util.collection;
}