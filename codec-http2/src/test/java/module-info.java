open module io.netty.codec.http2 {
    requires static jzlib;

    requires transitive io.netty.common;
    requires transitive io.netty.codec;
    requires transitive io.netty.transport;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec.http;
    requires transitive io.netty.handler;

    exports io.netty.handler.codec.http2;

    exports io.netty.handler.codec.http2.internal to org.mockito;
}