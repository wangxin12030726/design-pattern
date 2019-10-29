package decorator.demo2;

import java.util.Date;

/**
 * 计算团队奖金装饰器
 */
public class GroupPrizeDecorator extends  Decorator {
    public GroupPrizeDecorator(Component component) {
        super(component);
    }
    public double calcPrize(String user, Date begin, Date end){
        double money = super.calcPrize(user,begin,end);
        //计算出人员所在团队的销售总额
        double groupPirze = 0.0;
        for(double d: TempDB.mapMonthSaleMoney.values()){
            groupPirze += d;
        }
        double prize = groupPirze * 0.01;
        return money += prize;
    }
}
