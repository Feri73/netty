module io.netty.transport.udt {
    requires transitive barchart.udt.bundle;

    requires io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;

    exports io.netty.channel.udt;
    exports io.netty.channel.udt.nio;
}