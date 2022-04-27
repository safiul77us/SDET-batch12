package com.syntax.class31;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1 {

    public static void main(String[] args) throws IOException {
        String path = "Files/data.xlsx";
        //String path = "D:/JavaFiles/data.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        // using loop to get data from sheet
        // .getPhysicalNumberOfRows() is used to get the number of rows written inside the file
        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            Row row = sheet1.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }
}
