package bridge.demo2;

/**
 * 特急消息处理
 */
public class SpecialMessage extends AbstractionMessage{
    public SpecialMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void hurry(String messageId){
        //处理催促业务
    }

    public void sendMessage(String message,String toUser){
        message = "特急：" + message;
        super.sendMessage(message,toUser);
        //增加其他功能
    }
}
