package decorator.demo4;

/**
 * 业务接口，相当于装饰模式中的component
 * 这里使用的是接口来定义的，虽然抽象类的方式来定义组件是装饰模式的标准实现方式，但是不需要为
 * 子类提供公共功能的话，是可实现接口。
 */
public interface GoodsSaleEbi {

    /**
     * 保存销售信息，
     * @param user 操作人员
     * @param customer 客户
     * @param saleModel 销售信息
     * @return 保存是否成功
     */
    public boolean sale(String user,String customer,SaleModel saleModel);
}
