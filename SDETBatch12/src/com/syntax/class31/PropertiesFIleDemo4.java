package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFIleDemo4 {
    public static void main(String[] args) throws IOException {
        // path of file
        String path = "Files/Config.properties";
        // FileInputStream helps us read the data from a file
        FileInputStream fileInputStream = new FileInputStream(path);
        // special class that let us read the data from .properties files
        Properties properties = new Properties();
        // Reading the existing data and storing in the properties class
        properties.load(fileInputStream);
        // Adding new properties
        properties.put("URL", "www.google.com");
        // creating a file on mentioned path
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // storing all the data from the object inside that file
        properties.store(fileOutputStream,"added new property URL");
    }
}
