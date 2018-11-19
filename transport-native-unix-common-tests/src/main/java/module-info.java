module io.netty.transport.unix.common.tests {
    requires junit;

    requires io.netty.transport;
    requires io.netty.transport.unix.common;

    exports io.netty.channel.unix.tests to io.netty.transport.epoll, io.netty.transport.kqueue;
}