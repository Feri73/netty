module io.netty.example {
    requires protobuf.java;
    requires static netty.tcnative;
    requires static conscrypt.openjdk.uber;
    requires static npn.api;
    requires metrics.core;
    requires static bcpkix.jdk15on;
    requires static bcprov.jdk15on;
    requires slf4j.api;
    requires java.logging;
    requires java.activation;

    requires io.netty.transport;
    requires io.netty.codec;
    requires io.netty.handler;
    requires io.netty.transport.sctp;
    requires io.netty.transport.udt;
    requires io.netty.transport.rxtx;
    requires io.netty.handler.proxy;
    requires io.netty.codec.http;
    requires io.netty.codec.http2;
    requires io.netty.codec.memcache;
    requires io.netty.codec.redis;
    requires io.netty.codec.socks;
    requires io.netty.codec.stomp;
    requires io.netty.buffer;
    requires io.netty.common;
}