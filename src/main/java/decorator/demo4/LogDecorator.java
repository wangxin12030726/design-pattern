package decorator.demo4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends Decorator {
    public LogDecorator(GoodsSaleEbi goodsSaleEbi) {
        super(goodsSaleEbi);
    }

    public boolean sale(String user, String customer, SaleModel saleModel) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean b = this.goodsSaleEbi.sale(user,customer,saleModel);
        System.out.println("日志记录：" + user + "于" + df.format(new Date())+ "保存了一条销售记录，客户是："+ customer + ",购买记录是：" + saleModel);
        return b;
    }
}
