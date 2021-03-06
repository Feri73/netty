module io.netty.codec.socks {
    requires io.netty.common;
    requires transitive io.netty.transport;
    requires transitive io.netty.codec;
    requires transitive io.netty.buffer;

    exports io.netty.handler.codec.socks;
    exports io.netty.handler.codec.socksx;
    exports io.netty.handler.codec.socksx.v4;
    exports io.netty.handler.codec.socksx.v5;
}