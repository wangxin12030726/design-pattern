package factorymethod.demo1;
//创建器，声明工厂方法
public abstract class Creator {
    //创建product的工厂方法
    protected abstract Product factoryMethod();

    public void operator(){
        //通常在这些方法中需要调用factoryMethod方法来获取对象
        Product product = factoryMethod();
    }
}