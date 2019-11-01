package abstractfactory.demo1;
//组装电脑工程师
public class ComputerEngineer {
   //cpu
    private CPUApi cpuApi;
    //主板
    private MainboardApi mainboardApi;

    //装机过程
    public void createComputer(AbstracFacotry abstracFacotry){
        //1、选择cpu和主板
        prepare(abstracFacotry);
        //组装
        //测试
        //交付
    }

    /**
     * 准备装机所需要配件
     * @param abstracFacotry 客户选择的装机方法
     */
    private void prepare(AbstracFacotry abstracFacotry) {
        this.cpuApi = abstracFacotry.createCPUApi();
        this.mainboardApi = abstracFacotry.createMainboardApi();
        cpuApi.calculate();
        mainboardApi.installCPU();
    }

}
