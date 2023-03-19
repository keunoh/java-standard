package collectionsframework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : " + sysProp.getProperty("java.version"));
        System.out.println("user.language : " + sysProp.getProperty("user.language"));
        sysProp.list(System.out);

        try {
            sysProp.store(new FileOutputStream("about this"), "Properties Information");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
