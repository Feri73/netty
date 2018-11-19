open module io.netty.transport {
    requires commons.logging;

    requires transitive io.netty.buffer;
    requires transitive io.netty.common;
    requires transitive io.netty.resolver;

    exports io.netty.channel;
    exports io.netty.channel.embedded;
    exports io.netty.channel.group;
    exports io.netty.channel.local;
    exports io.netty.channel.nio;
    exports io.netty.channel.oio;
    exports io.netty.channel.pool;
    exports io.netty.channel.socket;
    exports io.netty.channel.socket.nio;
    exports io.netty.channel.socket.oio;
    exports io.netty.bootstrap;

    exports io.netty.channel.internal to io.netty.transport.epoll, io.netty.transport.kqueue;
}