package factorymethod.demo2;

/**
 * 导出文件的接口
 */
public interface ExportFile {
    /**
     * 导出文件
     * @param data 导出的数据
     * @return 返回是否导出成功
     */
    public boolean export(String data);
}
