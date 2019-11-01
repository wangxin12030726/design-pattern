package bridge.demo1;

/**
 * 定义抽象部分的接口
 */
public abstract class Abstraction {

    /**
     * 持有一个实现部分的接口
     */
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 示例方法，实现一定的功能，可以转调实现部分的方法
     */
    public void operationImpl(){
        implementor.operationImpl();
    }
}
