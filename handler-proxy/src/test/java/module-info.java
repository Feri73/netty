open module io.netty.handler.proxy {
    requires commons.logging;
    requires io.netty.handler;
    requires io.netty.resolver;

    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive io.netty.codec.socks;
    requires transitive io.netty.codec.http;
    requires io.netty.buffer;
    requires io.netty.codec;

    exports io.netty.handler.proxy;
}