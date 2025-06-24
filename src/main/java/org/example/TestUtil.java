package org.example;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {

    public String readProperty(String key) throws IOException {

        FileReader reader = new FileReader("src/test/resources/config.properties");

        Properties p = new Properties();
        p.load(reader);

        return p.getProperty(key);

    }
}
