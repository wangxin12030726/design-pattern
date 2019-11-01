package factorymethod.demo2;

/**
 * 导出txt格式的文件
 */
public class ExportTxtFile implements ExportFile {
    //实现导出txt文件的方法
    public boolean export(String data) {
        System.out.println("导出txt文件，文件内容为：" + data);
        return true;
    }
}
