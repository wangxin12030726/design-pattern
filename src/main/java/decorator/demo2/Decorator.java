package decorator.demo2;

import java.util.Date;

public abstract class Decorator extends Component{
    //持有一个被装饰的组件
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return component.calcPrize(user,begin,end);
    }
}
