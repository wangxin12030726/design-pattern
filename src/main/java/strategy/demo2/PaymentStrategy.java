package strategy.demo2;

/**
 * 支付策略接口
 * 此案例出自《研磨设计模式》一书
 * 工资支付方式：
 *     工资支付方式有很多种，现金支付，支付宝转账，银行账户转到工资账户，银行账户到工资卡
 *    现金支付不需要支付宝账号，银行卡号等
 *    银行支付就需要银行卡号
 */
public interface PaymentStrategy {

    public void  pay(PaymentContext ctx);
}
