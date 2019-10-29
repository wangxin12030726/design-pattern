package strategy.demo1;

/**
 * 上下问对象，通常会持有一个策略接口
 */
public class Context {

    //持有一个策略接口
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 根据客户消费价格，计算出一个打折后的价格
     * @param price
     * @return
     */
    public double quote(double price){
        return this.strategy.discount(price);
    }
}
