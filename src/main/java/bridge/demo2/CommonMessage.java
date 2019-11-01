package bridge.demo2;

/**
 * 普通消息
 */
public class CommonMessage extends AbstractionMessage {
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void sendMessage(String message,String toUser){
        //普通消息什么都不干，直接发送消息
        super.sendMessage(message,toUser);
    }
}
