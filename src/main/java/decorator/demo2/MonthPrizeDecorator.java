package decorator.demo2;

import java.util.Date;

/**
 * 计算月度奖金装饰器
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component component) {
        super(component);
    }
    public double calcPrize(String user, Date begin, Date end){
        //1、先获取前面计算的奖金
        double money = super.calcPrize(user, begin, end);
        //2、然后计算当月的奖金，按照人员和时间去获取当月的业务额，然后再乘以3%
        Double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        return money + prize;
    }
}
