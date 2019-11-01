package simplefactory;

import java.io.File;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        Api api = FactoryProperties.getApi();
        api.test();
    }
}
