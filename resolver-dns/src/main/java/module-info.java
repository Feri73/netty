module io.netty.resolver.dns {
    requires java.naming;

    requires transitive io.netty.common;
    requires transitive io.netty.resolver;
    requires transitive io.netty.codec.dns;
    requires transitive io.netty.transport;
    requires io.netty.buffer;
    requires io.netty.codec;

    exports io.netty.resolver.dns;
}