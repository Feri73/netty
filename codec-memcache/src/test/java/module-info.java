open module io.netty.codec.memcache {
    requires commons.logging;

    requires transitive io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec.memcache;
    exports io.netty.handler.codec.memcache.binary;
}