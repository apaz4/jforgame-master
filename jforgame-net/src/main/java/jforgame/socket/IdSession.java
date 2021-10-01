package jforgame.socket;

import io.netty.channel.Channel;
import jforgame.socket.message.Message;
import org.apache.mina.core.session.IoSession;

import java.net.InetSocketAddress;

/**
 * 玩家登录session，不与任何nio框架绑定
 *
 * @author kinson
 * @see IoSession
 * @see Channel
 */
public interface IdSession {

    String ID = "ID";

    void sendPacket(Message packet);

    long getOwnerId();

    InetSocketAddress getRemoteAddress();

    String getRemoteIP();

    int getRemotePort();

    InetSocketAddress getLocalAddress();

    String getLocalIP();

    int getLocalPort();

    /**
     * 更新属性值
     *
     * @param key
     * @param value
     * @return
     */
    Object setAttribute(String key, Object value);

    /**
     * 修改属性值
     *
     * @param key
     * @return
     */
    Object getAttribute(String key);

}
