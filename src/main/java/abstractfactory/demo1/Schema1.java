package abstractfactory.demo1;

/**
 * Intel cpu + GA 主板
 */
public class Schema1 implements AbstracFacotry {
    public CPUApi createCPUApi() {
        return new IntelCpu(1133);
    }

    public MainboardApi createMainboardApi() {
        return new GAMainboard(1133);
    }
}
