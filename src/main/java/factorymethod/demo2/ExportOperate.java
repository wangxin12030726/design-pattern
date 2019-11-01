package factorymethod.demo2;
//实现导出数据业务功能的对象

public abstract class ExportOperate {
    /**
     * 导出文件
     * @param data 数据内容
     * @return 返回成功标识
     */
    public boolean  export(String data){
        ExportFile exportFile = factoryMethod();
        return exportFile.export(data);
    }

    protected abstract  ExportFile factoryMethod();
}
