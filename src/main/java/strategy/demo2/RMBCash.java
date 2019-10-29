package strategy.demo2;

/**
 * 人民币支付
 */
public class RMBCash implements PaymentStrategy {
    public void pay(PaymentContext ctx) {
        System.out.println("现在给：" + ctx.getUserName() + " 支付工资，人民币工资金额为：" + ctx.getSolary());
    }
}
