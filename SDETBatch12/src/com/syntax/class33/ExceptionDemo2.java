package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args)  {
        FileInputStream fileInputStream=null;
        try{
            String path = "D:/JavaFiles/data.xlsx";
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            Sheet sheet1 = workbook.getSheet("Sheet1");

        }
        catch (FileNotFoundException exception){
            System.out.println("The File that you are trying to read is not present" +
                    " on provided path please check your path again");
        }catch (IOException ioException){
            System.out.println("Something with hard drive went wrong");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(" error while closing the file");
            }
        }

        System.out.println("Now you should be able to perform other operations");
    }
}
