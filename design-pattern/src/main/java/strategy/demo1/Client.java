package strategy.demo1;

public class Client {
    public static void main(String[] args) {
        //创建所需要的策略对象
        Strategy strategy = new StratebyBImpl();
        //创建上下文
        Context context = new Context(strategy);
        //计算报价
        double quote = context.quote(10000);
        System.out.println("客户为会员客户：" + quote);

    }
}
