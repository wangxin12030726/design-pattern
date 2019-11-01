package bridge.demo2;

public class MessageEmail implements MessageImplementor {
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息：" + message + "给" + toUser);
    }
}
