package bridge.demo2;

public class Client {
    public static void main(String[] args) {
        //创建一个具体的实现对象
        MessageImplementor sms = new MessageSMS();
        //创建一个普通的消息对行，以SMS的方式进行消息发送
        AbstractionMessage m = new CommonMessage(sms);
        m.sendMessage("普通的消息对象，以SMS方式进行了发送","张三");

        //创建一个加急的消息对象
        m = new UrgencyMessage(sms);
        m.sendMessage("加急的消息，以SMS方式进行了发送","王五");
    }
}
