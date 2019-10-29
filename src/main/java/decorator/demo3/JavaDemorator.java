package decorator.demo3;

import java.io.*;

public class JavaDemorator {
    public static void main(String[] args) {
        OutputStream out = null;
        String filePath = "E:\\study\\test\\design-pattern\\src\\main\\java\\decorator\\demo3\\test.txt";
        try {
//            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(filePath))));
            out = new DataOutputStream(new MyEncryptOutputStream(new BufferedOutputStream(new FileOutputStream(new File(filePath)))));
            out.write("abcdefghigklmn".getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
