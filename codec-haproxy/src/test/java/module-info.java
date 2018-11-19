open module io.netty.codec.haproxy {
    requires commons.logging;

    requires io.netty.common;
    requires transitive io.netty.codec;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec.haproxy;
}