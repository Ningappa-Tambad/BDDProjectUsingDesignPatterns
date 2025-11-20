package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties props;

    public static void loadProperties() {
        props = new Properties();

        try {
            String env = System.getProperty("env", "qa");
            String path = "src/test/resources/config/" + env + ".properties";

            FileInputStream fis = new FileInputStream(path);
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load propert ies from file: ");
        }
    }

    public static String getProperty(String key)
    {
        if(props==null)
            loadProperties();
       return props.getProperty(key);
    }


}
