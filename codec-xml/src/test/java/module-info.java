open module io.netty.codec.xml {
    requires commons.logging;
    requires io.netty.common;

    requires aalto.xml;
    requires java.xml;

    requires transitive io.netty.codec;
    requires transitive io.netty.transport;
    requires transitive io.netty.buffer;

    exports io.netty.handler.codec.xml;
}