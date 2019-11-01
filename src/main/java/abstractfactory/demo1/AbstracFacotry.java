package abstractfactory.demo1;

/**
 * 抽象工厂，声明创建抽象产品对象的操作
 */
public interface  AbstracFacotry {

    //创建cpu对象
    public CPUApi createCPUApi();
    //创建主板对象
    public MainboardApi createMainboardApi();
}
