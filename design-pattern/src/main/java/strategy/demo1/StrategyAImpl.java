package strategy.demo1;

/**
 * 策略接口Stratety的第一种实现，实现商品打8折
 */
public class StrategyAImpl implements Strategy {
    public double discount(double price) {
        System.out.println("商场周年店庆，打8折");
        return price * 0.8;
    }
}
