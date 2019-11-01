package factorymethod.demo2;

/**
 * 具体创建器实现类，创建导出txt格式的对象
 */
public class ExportTxtOperate extends ExportOperate {
    protected ExportFile factoryMethod() {
        return new ExportTxtFile();
    }
}
