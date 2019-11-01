package abstractfactory.demo1;

/**
 * 微星主板
 */
public class MSIMainBoard implements MainboardApi {//
    //cpu卡槽数
    private int cpuHoles = 0;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {

        System.out.println("微星主板，cpu卡槽数：" +cpuHoles);
    }
}
