package decorator.demo4;

public class CheckDecorator extends Decorator {
    public CheckDecorator(GoodsSaleEbi goodsSaleEbi) {
        super(goodsSaleEbi);
    }

    public boolean sale(String user, String customer, SaleModel saleModel) {
        if(!user.equals("张三")){
            System.out.println("对不起"+user + ",你没有保存销售单的圈钱");
            return false;
        }else{
            this.goodsSaleEbi.sale(user,customer,saleModel);
        }
        return false;
    }
}
