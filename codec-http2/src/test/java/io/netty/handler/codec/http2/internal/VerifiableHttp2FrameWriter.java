/*
 * Copyright 2018 The Netty-JPMS Project
 *
 * The Netty-JPMS Project licenses this file to you under the Apache License, version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.netty.handler.codec.http2.internal;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http2.DefaultHttp2FrameWriter;

public class VerifiableHttp2FrameWriter extends DefaultHttp2FrameWriter {
    @Override
    public ChannelFuture writeData(ChannelHandlerContext ctx, int streamId, ByteBuf data,
                                   int padding, boolean endStream, ChannelPromise promise) {
        // duplicate 'data' to prevent readerIndex from being changed, to ease verification
        return super.writeData(ctx, streamId, data.duplicate(), padding, endStream, promise);
    }
}
