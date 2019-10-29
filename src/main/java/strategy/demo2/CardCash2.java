package strategy.demo2;

/**
 * 银行卡支付，此处将银行账户放入到策略实现了中， 不放在上下文扩展中
 * 2种方式各有各的有点和缺点
 */
public class CardCash2 implements PaymentStrategy {

    //账户信息
    private String account;

    public CardCash2(String account) {
        this.account = account;
    }

    public void pay(PaymentContext ctx) {
        System.out.println("现在给：" + ctx.getUserName()+"的 " + this.account+"账户支付了"
                +ctx.getSolary()+"元。");
        //调用银行接口转账
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
