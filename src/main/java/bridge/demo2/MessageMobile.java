package bridge.demo2;

/**
 * 扩展消息发送方式，以手机发送
 */
public class MessageMobile implements MessageImplementor {
    public void send(String message, String toUser) {
        System.out.println("使用手机方式发送消息：" + message + "给" + toUser);
    }
}
