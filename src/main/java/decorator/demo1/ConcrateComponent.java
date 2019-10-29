package decorator.demo1;

/**
 * 具体实现组件接口的对象
 */
public class ConcrateComponent extends Component {
    public void operation() {
        //相应的处理逻辑
        System.out.println("我是原来的组件对象执行逻辑");
    }
}

