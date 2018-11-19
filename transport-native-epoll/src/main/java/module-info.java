module io.netty.transport.epoll {
    requires io.netty.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.transport;
    requires io.netty.transport.unix.common;
}