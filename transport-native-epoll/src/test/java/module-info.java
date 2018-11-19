open module io.netty.transport.epoll {
    requires commons.logging;
    requires io.netty.testsuite;
    requires io.netty.handler;

    requires io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;
    requires io.netty.transport.unix.common;

    requires io.netty.transport.unix.common.tests;
}