package abstractfactory.demo1;

/**
 * Intel 的cpu实现类
 */
public class IntelCpu implements CPUApi {
    //cpu的针脚数目
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("intel cpu ,this pins is " + pins);
    }
}
