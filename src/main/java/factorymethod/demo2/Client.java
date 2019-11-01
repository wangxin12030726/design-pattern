package factorymethod.demo2;

public class Client {
    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportDBOperate();
        exportOperate.export("测试db数据");
    }
}
