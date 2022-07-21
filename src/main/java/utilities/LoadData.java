package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadData {
    public static String getData(String key) throws IOException {
        String path = System.getProperty("user.dir") + "//src//main//resources//Data.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        return properties.getProperty(key);
    }
}
