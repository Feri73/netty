module io.netty.transport.rxtx {
    requires rxtx;

    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;

    exports io.netty.channel.rxtx;
}