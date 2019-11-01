package simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 读取配置文件，利用发射创建实现类
 */
public class FactoryProperties {

    public static Api getApi(){
        Api api = null;
        Properties p = new Properties();
        InputStream in = FactoryProperties.class.getResourceAsStream("factoryTest.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String apiIpmlName = p.getProperty("api.impl");
        try {
            api = (Api)Class.forName(apiIpmlName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }

}
