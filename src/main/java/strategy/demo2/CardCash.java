package strategy.demo2;

/**
 * 银行卡支付工资
 */
public class CardCash implements PaymentStrategy {
    public void pay(PaymentContext ctx) {
        //这个新的算法知道自己需要使用扩展之后的上下文，强制转换一下
        PaymentContext2 ctx2 = (PaymentContext2) ctx;
        System.out.println("现在给：" + ctx2.getUserName()+"的 " + ctx2.getAccount()+"账户支付了"
                            +ctx2.getSolary()+"元。");
        //调用银行接口转账
    }
}
