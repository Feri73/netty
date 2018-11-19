open module io.netty.codec {
    requires static jboss.marshalling;
    requires static lzma.java;
    requires static compress.lzf;
    requires static jzlib;
    requires static lz4;
    requires static protobuf.java;
    requires static protobuf.javanano;

    requires transitive io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;

    exports io.netty.handler.codec;
    exports io.netty.handler.codec.base64;
    exports io.netty.handler.codec.bytes;
    exports io.netty.handler.codec.compression;
    exports io.netty.handler.codec.json;
    exports io.netty.handler.codec.marshalling;
    exports io.netty.handler.codec.protobuf;
    exports io.netty.handler.codec.serialization;
    exports io.netty.handler.codec.string;

    exports io.netty.handler.codec.internal to org.mockito;
}