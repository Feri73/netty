open module io.netty.testsuite {
    requires junit;
    requires java.management;
    requires slf4j.api;
    requires xz;
    requires netty.dependencies.hamcrest;

    requires io.netty.transport;
    requires io.netty.common;
    requires io.netty.buffer;
    requires io.netty.transport.sctp;
    requires io.netty.handler;
    requires io.netty.transport.udt;
    requires io.netty.codec.http;

    exports io.netty.testsuite.transport to io.netty.transport.epoll, io.netty.transport.kqueue;
    exports io.netty.testsuite.transport.socket to io.netty.transport.epoll, io.netty.transport.kqueue;
    exports io.netty.testsuite.util to io.netty.transport.epoll;
}