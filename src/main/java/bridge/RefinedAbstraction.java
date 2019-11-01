package bridge;

import bridge.demo1.Abstraction;
import bridge.demo1.Implementor;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    public void otherOperation(){
        /**
         * 实现一定的功能，可能会使用具体实现部分的方法
         * 但是本方法更大的可能是使用Abstraction中定义的方法
         * 通过组合使用Abstraction的中定义的方法来完成更多的功能
         */
    }
}
