module io.netty.handler {
    requires static conscrypt.openjdk.uber;
    requires static netty.tcnative;
    requires static npn.api;
    requires static alpn.api;
    requires static bcpkix.jdk15on;
    requires static bcprov.jdk15on;

    requires transitive io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;
    requires transitive io.netty.codec;

    exports io.netty.handler.flow;
    exports io.netty.handler.flush;
    exports io.netty.handler.ipfilter;
    exports io.netty.handler.logging;
    exports io.netty.handler.ssl;
    exports io.netty.handler.ssl.util;
    exports io.netty.handler.ssl.ocsp;
    exports io.netty.handler.stream;
    exports io.netty.handler.timeout;
    exports io.netty.handler.traffic;
}