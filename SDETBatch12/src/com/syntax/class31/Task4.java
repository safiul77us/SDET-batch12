package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task4 {
    /*
    Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
     */

    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaFiles\\safiul.properties";

        FileInputStream fileInputStream = new FileInputStream(path); //reading

       Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

    }
}
