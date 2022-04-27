package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaFiles\\safiul.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path); //Writing
        Properties properties = new Properties();
        properties.put("username", "safiul");
        properties.put("password", "1234");
        properties.store(fileOutputStream, "Added some new update");
    }

}
