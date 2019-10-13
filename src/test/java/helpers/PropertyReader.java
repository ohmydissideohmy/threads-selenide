package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyReader {
    private Properties props = null;

    public PropertyReader() {
        props = new Properties();
        try {
                FileInputStream file = new FileInputStream(
                        new File("userdata.properties"));
                props.load(file);
            }
        catch (Exception e) {
            System.out.println("Cann't read file app.properties");
        }
    }

    public synchronized String getProperty(String key) {
        String value = null;
        if (props.containsKey(key))
            value = (String) props.get(key);
        else {
            System.out.println(key +" is not found!!!");
        }
        return value;
    }

    public synchronized void setProperty(String key, String value) {
        if (props.containsKey(key)) {
            props.setProperty(key, value);
            try {
                FileOutputStream file = new FileOutputStream(
                        new File("app.properties"));
                props.store(file,"");
            } catch (Exception e) {
                System.out.println("Can't store file app.properties");
            }
        }
        else {
            System.out.println(key +" is not found!!!");
        }
    }
}
