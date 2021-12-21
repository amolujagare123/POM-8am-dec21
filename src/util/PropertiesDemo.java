package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {

        // 1. read the file

        FileInputStream fis = new FileInputStream("config/config.properties");

        // 2. create object of properties class

        Properties prop = new Properties();

        // 3. load this object with file
        prop.load(fis);

        // 4. read the value of the keys

        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));


    }
}
