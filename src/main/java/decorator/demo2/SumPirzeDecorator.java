package decorator.demo2;

import java.util.Date;

/**
 * 计算累计奖金装饰器
 */
public class SumPirzeDecorator extends Decorator{
    public SumPirzeDecorator(Component component) {
        super(component);
    }
    public double calcPrize(String user, Date begin, Date end){

        Double money = super.calcPrize(user,begin,end);
        //计算人员的累计奖金，获取人员的累计销售额，然后再乘以1%
        //这里默认按照1000000计算
        double prize = 1000000 * 0.01;
        return money + prize ;
    }
}
