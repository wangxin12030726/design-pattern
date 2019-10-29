package decorator.demo1;

/**
 * 装饰器的具体实现类，向组件对象添加功能
 */
public class ConcreateDecoratorA extends Decorator {

    public ConcreateDecoratorA(Component component) {
        super(component);
    }

    //添加的状态
    private String addedState;

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    public void operation(){
        //调用父类的方法，在调用前后进行一些操作
        //在这里调用的时候可以使用到添加状态
        super.operator();
    }
}
