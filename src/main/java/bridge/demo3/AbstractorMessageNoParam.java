package bridge.demo3;

import bridge.demo2.MessageEmail;
import bridge.demo2.MessageImplementor;
import bridge.demo2.MessageMobile;
import bridge.demo2.MessageSMS;

/**
 * 外部不需要传入参数，在抽象类内部创建实现部分
 */
public class AbstractorMessageNoParam {
    //构造函数，不需要传入参数和创建实现部分
    public AbstractorMessageNoParam() {
    }
    public void sendMessage(String message,String toUser){
        this.getMessageImplementorImpl(message).send(message,toUser);
    }

    public MessageImplementor getMessageImplementorImpl(String message){
        MessageImplementor messageImplementor = null;
        if(message == null){
            messageImplementor = new MessageSMS();
        }else if(message.length() < 500){
            messageImplementor = new MessageMobile();
        }else{
            messageImplementor = new MessageEmail();
        }
        return messageImplementor;
    }
}
