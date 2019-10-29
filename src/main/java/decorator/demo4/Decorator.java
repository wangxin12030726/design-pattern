package decorator.demo4;

/**
 * 装饰接口，需要和被装饰的对象实现同样的接口
 */
public abstract class Decorator implements GoodsSaleEbi {
    //持有被装饰的组件对象
    protected GoodsSaleEbi goodsSaleEbi;

    public Decorator(GoodsSaleEbi goodsSaleEbi) {
        this.goodsSaleEbi = goodsSaleEbi;
    }
}
