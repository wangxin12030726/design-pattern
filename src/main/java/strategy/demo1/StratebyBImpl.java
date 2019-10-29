package strategy.demo1;

public class StratebyBImpl implements  Strategy{
    public double discount(double price) {
        System.out.println("会员用户打折9.8折");
        return price * 0.98;
    }
}
