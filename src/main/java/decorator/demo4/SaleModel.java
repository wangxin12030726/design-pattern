package decorator.demo4;

/**
 * 封装销售单的数据，简单示意
 */
public class SaleModel {

    //销售的商品
    private String goods;

    //销售的数量
    private int saleNum;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public SaleModel() {
    }

    public SaleModel(String goods, int saleNum) {
        this.goods = goods;
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "SaleModel{" +
                "goods='" + goods + '\'' +
                ", saleNum=" + saleNum +
                '}';
    }
}
