package abstractfactory.demo1;

public class Client {
    public static void main(String[] args) {
        //选择装机方法
        AbstracFacotry abstracFacotry = new Schema1();
        //创建装机工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
        //组装电脑
        computerEngineer.createComputer(abstracFacotry);
    }
}
