package decorator.demo2;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) {
        //创建基本的计算奖金的类，也就是需要装饰的对象
        Component component = new ConcrateComponent();

        /**
         * 然后对计算的基本奖金对象进行装饰，这里要组合进行装饰
         * 说明，各个装饰之间最好不要有顺序的限制，也就是先装饰和后装饰效果是一样的
        */
        Decorator decorator1 = new MonthPrizeDecorator(component);
        Decorator decorator2 = new SumPirzeDecorator(decorator1);
        double prize = decorator2.calcPrize("张三", null, null);
        System.out.println("张三的奖金是：" + prize);

        Decorator decorator3 = new GroupPrizeDecorator(decorator2);
        double prize1 = decorator3.calcPrize("王五", null, null);
        System.out.println("王五的奖金是：" + prize1);

    }
}
