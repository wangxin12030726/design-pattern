package decorator.demo1;

/**
 * 装饰接口，唯一一个指向组件对象的接口，并定义一个与组件接口一致的接口
 */
public abstract class Decorator extends  Component{
    //持有对象组件
    protected  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operator(){
        //转发请求给组件对象，可以在转发之前或者之后进行一些操作
        component.operation();
    }
}
