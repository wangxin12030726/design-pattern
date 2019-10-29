package strategy.demo2;

public class Client {
    public static void main(String[] args) {
        //创建转账策略
        PaymentStrategy rmb = new RMBCash();
        PaymentStrategy dollar = new DollarCash();

        //创建上下文
        PaymentContext ctx = new PaymentContext("wangxin",30000.0,rmb );
        ctx.payNow();
        //创建上下文
        PaymentContext ctx2 = new PaymentContext("张三",29900,dollar);
        ctx2.payNow();

        //银行卡转账
        PaymentStrategy card = new CardCash();
        PaymentContext ctx3 = new PaymentContext2("王五",50000,"4103993938474783782",card);
        ctx3.payNow();

        //第二中银行卡转账
        PaymentStrategy card2 = new CardCash2("347809892903333");
        PaymentContext ctx4 = new PaymentContext("赵六",60000,card2);
        ctx4.payNow();
    }
}
