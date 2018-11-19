module io.netty.transport.sctp {
    requires io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec.sctp;
    exports io.netty.channel.sctp;
    exports io.netty.channel.sctp.nio;
    exports io.netty.channel.sctp.oio;
}