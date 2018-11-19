module io.netty.codec.smtp {
    requires transitive io.netty.common;
    requires transitive io.netty.codec;
    requires transitive io.netty.transport;
    requires transitive io.netty.buffer;

    exports io.netty.handler.codec.smtp;
}