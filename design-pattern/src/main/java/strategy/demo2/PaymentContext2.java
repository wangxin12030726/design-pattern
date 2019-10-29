package strategy.demo2;

/**
 * 扩展的支付对象上下文
 */
public class PaymentContext2 extends  PaymentContext {
    //银行账户
    private String account;

    public PaymentContext2(String userName, double solary,String account,PaymentStrategy paymentStrategy) {
        super(userName, solary, paymentStrategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
