package com.syntax;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //String path = "Files/data.xlsx";
        String path = "D:/JavaFiles/data.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
            Row row=sheet.getRow(j);
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                System.out.print(row.getCell(i)+" ");
            }
            System.out.println();
        }

    }
}
