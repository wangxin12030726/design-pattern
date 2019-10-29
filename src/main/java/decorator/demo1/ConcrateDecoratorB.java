package decorator.demo1;

public class ConcrateDecoratorB extends Decorator {

    public ConcrateDecoratorB(Component component) {
        super(component);
    }

    /**
     * 要添加的职责
     */
    private void addedBehavior(){

    }
    public void operation(){
        //调用父类的方法，可以在调用前后执行一些附加操作
        super.operator();
        addedBehavior();
    }
}
