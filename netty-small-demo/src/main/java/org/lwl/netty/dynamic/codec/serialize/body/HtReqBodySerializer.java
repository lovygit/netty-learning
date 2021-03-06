package org.lwl.netty.dynamic.codec.serialize.body;

import io.netty.buffer.ByteBuf;
import org.lwl.netty.dynamic.codec.serialize.IBodySerializer;
import org.lwl.netty.dynamic.message.Body;
import org.lwl.netty.dynamic.message.body.HeartbeatReqBody;

/**
 * @author thinking_fioa
 * @createTime 2018/7/29
 * @description
 */


public final class HtReqBodySerializer implements IBodySerializer<HeartbeatReqBody> {

    private static final HtReqBodySerializer INSTANCE = new HtReqBodySerializer();
    private HtReqBodySerializer(){}

    public static HtReqBodySerializer getInstance() {
        return INSTANCE;
    }

    @Override
    public void serialize(ByteBuf outByteBuf, Body body) {

    }

    @Override
    public HeartbeatReqBody deserialize(ByteBuf inByteBuf) {
        return new HeartbeatReqBody();
    }
}
