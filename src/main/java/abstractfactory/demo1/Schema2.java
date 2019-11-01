package abstractfactory.demo1;

/**
 * 第二中方案，AMD cpu + 微星主板
 */
public class Schema2 implements AbstracFacotry {
    public CPUApi createCPUApi() {
        return new AMDCpu(2323);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainBoard(2323);
    }
}
