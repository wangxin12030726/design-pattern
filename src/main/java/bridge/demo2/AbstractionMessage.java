package bridge.demo2;


/**
 * 抽象消息对象
 */
public  abstract class AbstractionMessage {
    //持有一个实现部分的接口对象
    private MessageImplementor messageImplementor;

    public AbstractionMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    /**
     * 发送消息，调用实现部分的方法
     * @param message
     * @param toUser
     */
    public void sendMessage(String message,String toUser){
        messageImplementor.send(message,toUser);
    }
}
