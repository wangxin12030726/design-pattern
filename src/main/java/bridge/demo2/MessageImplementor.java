package bridge.demo2;

/**
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 消息内容
     * @param toUser 消息接收人员
     */
    public void send(String message,String toUser);
}
