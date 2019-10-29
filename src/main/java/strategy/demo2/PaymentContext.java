package strategy.demo2;

/**
 * 上下文
 */
public class PaymentContext {
    //应被支付工资的人员姓名
    private String userName = null;
    //应被支付的工资金额
    private double solary;
    //支付工资的方式策略
    private PaymentStrategy paymentStrategy;

    public PaymentContext(String userName,double solary,PaymentStrategy paymentStrategy){
        this.userName = userName;
        this.solary = solary;
        this.paymentStrategy = paymentStrategy;
    }

    //支付工资
    public void payNow(){
        this.paymentStrategy.pay(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getSolary() {
        return solary;
    }

    public void setSolary(double solary) {
        this.solary = solary;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
