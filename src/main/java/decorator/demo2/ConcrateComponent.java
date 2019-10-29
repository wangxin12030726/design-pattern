package decorator.demo2;

import java.util.Date;

/**
 * 计算奖金的具体实现类，也是被装饰器修饰的对象
 */
public class ConcrateComponent extends Component {

    public double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}
