package abstractfactory.demo1;

/**
 * GA 主板
 */
public class GAMainboard implements  MainboardApi{
    //cpu卡槽数
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("GA 主板，cpu卡槽数是:"+ cpuHoles);
    }
}
