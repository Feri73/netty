open module io.netty.codec.redis {
    requires commons.logging;

    requires transitive io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec.redis;
}