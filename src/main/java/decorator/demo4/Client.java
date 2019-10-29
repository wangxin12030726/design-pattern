package decorator.demo4;

public class Client {
    public static void main(String[] args) {
        //创建原有的组件
        GoodsSaleEbi goodsSaleEbi = new GoodsSaleEbo();
        //创建装饰器
        SaleModel saleModel = new SaleModel("茅台",100);
        Decorator decorator = new CheckDecorator(goodsSaleEbi);
        Decorator decorator1 = new LogDecorator(decorator);
//        decorator1.sale("王五","张老板",saleModel);
        decorator1.sale("张三","张老板",saleModel);
    }
}
