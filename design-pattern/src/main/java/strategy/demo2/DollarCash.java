package strategy.demo2;

/**
 * 美元支付工资
 */
public class DollarCash implements PaymentStrategy {
    public void pay(PaymentContext ctx) {
        System.out.println("现在给：" + ctx.getUserName() + " 支付工资，美金工资金额为：" + ctx.getSolary());
    }
}
