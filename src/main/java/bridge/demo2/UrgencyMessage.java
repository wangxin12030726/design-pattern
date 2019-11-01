package bridge.demo2;

public class UrgencyMessage extends AbstractionMessage {
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    public void sendMessage(String message,String toUser){
        message = "加急" + message;
        super.sendMessage(message,toUser);
    }

    /**
     * 扩展自己的新功能，监控某消息的处理过程
     * @param messageId 被监控的消息ID
     * @return
     */
    public Object watch(String messageId){
        //获取相应的数据，组织成监控的数据对象，然后返回

        return null;
    }
}
