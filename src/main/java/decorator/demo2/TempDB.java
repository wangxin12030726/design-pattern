package decorator.demo2;

import java.util.HashMap;
import java.util.Map;

public class TempDB {
    public TempDB() {
    }

    /**
     * 记录每个人的月销售额度，只使用了人员，没有使用月份
     */
    public static Map<String,Double> mapMonthSaleMoney = new HashMap<String,Double>();
    static{
        mapMonthSaleMoney.put("张三",100000.0);
        mapMonthSaleMoney.put("李四",300000.0);
        mapMonthSaleMoney.put("王五",500000.0);
    }
}
