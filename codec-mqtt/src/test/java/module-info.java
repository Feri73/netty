open module io.netty.codec.mqtt {
    requires commons.logging;

    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;
    requires transitive io.netty.codec;
    requires transitive io.netty.common;

    exports io.netty.handler.codec.mqtt;
}