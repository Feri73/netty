module io.netty.transport.unix.common {
    requires transitive io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;

    exports io.netty.channel.unix;
}