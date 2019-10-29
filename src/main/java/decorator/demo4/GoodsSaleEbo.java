package decorator.demo4;

/**
 * 接口的基本实现类
 */
public class GoodsSaleEbo implements  GoodsSaleEbi {
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //模拟dao层操作保存数据库 
        System.out.println(user + "保存了 " + customer + " 购买 " +saleModel + "的销售数据");
        return true;
    }
}
