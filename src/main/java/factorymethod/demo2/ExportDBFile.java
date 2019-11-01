package factorymethod.demo2;

/**
 * 导出生数据库备份文件格式的对象
 */
public class ExportDBFile implements ExportFile {
    //导出方法实现
    public boolean export(String data) {
        System.out.println("导出数据为db格式，数据内容为： " + data);
        return true;
    }
}
