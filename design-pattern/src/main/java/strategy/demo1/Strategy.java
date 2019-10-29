package strategy.demo1;

/**
 * 策略模式 基本定义
 * 角色定有三类：1、策略接口；2、具体的策略实现类；3：上下文
 * 此处以超市商品打折和活动举例说明
 *
 * 注意：此处定义为接口，如果每一个策略的具体实现类有很多公共功能的话，可以把Strategy实现为抽象类
 *        然后把多个算法的公共功能实现到Strategy中。
 */
public interface Strategy {

    /**
     * 定义一个商品打折的接口方法，此方法可以有返回值，可以传入参数
     */
    public double discount(double price);

}
