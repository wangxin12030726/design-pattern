package factorymethod.demo1;

/**
 * 具体的创建器的实现对象
 */
public class ConcrateCreator extends Creator {
    protected Product factoryMethod() {
        //重新实现factoryMethod，返回一个Product对象
        return new ConcreteProduct();
    }
}
