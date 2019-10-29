package decorator.demo2;

import java.util.Date;

/**
 * 计算奖金的组件接口
 */
public abstract class Component {
    /**
     * 计算某人在某一段时间内的奖金，有一些参数在此处没有使用
     * @param user 被计算奖金的人员
     * @param begin 计算奖金的开始时间
     * @param end 计算奖金的结束使劲
     * @return 被计算人员在某段时间内的奖金
     */
    public abstract double calcPrize(String user, Date begin, Date end);
}
