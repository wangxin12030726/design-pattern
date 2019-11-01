package bridge.demo3;

import bridge.demo2.MessageEmail;
import bridge.demo2.MessageImplementor;
import bridge.demo2.MessageMobile;
import bridge.demo2.MessageSMS;

/**
 * 通过传递参数在抽象类内部自己创建实现类，
 */
public class AbstractMessageByType {

    private MessageImplementor messageImplementor;

    /**
     * 构造方法，传入选择实现部分的类型
     * @param type
     */
    public AbstractMessageByType(int type) {
        if(type == 1 ){
            messageImplementor = new MessageSMS();
        }else if(type == 2){
            messageImplementor = new MessageEmail();
        }else if(type == 3){
            messageImplementor = new MessageMobile();
        }
    }

    public void sendMessage(String message,String toUser){
        this.messageImplementor.send(message,toUser);
    }
}
