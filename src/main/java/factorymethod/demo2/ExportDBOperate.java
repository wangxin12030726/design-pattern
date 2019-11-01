package factorymethod.demo2;

/**
 * 创建器的具体实现类，创建导出DB格式的对象
 */
public class ExportDBOperate extends ExportOperate {
    protected ExportFile factoryMethod() {
        return new ExportDBFile();
    }
}
