package com.syntax;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        try {
            FileInputStream x = new FileInputStream(new File("D:/JavaFiles/Book2.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            Workbook workbook = new XSSFWorkbook(x);

            //Get first/desired sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            for (Iterator<Row> iterator = sheet.iterator();
                 iterator.hasNext(); ) {
                Row row = (Row) iterator.next();
                for (Iterator<Cell> iterator2 = row.iterator();
                     iterator2.hasNext(); ) {
                    Cell cell = (Cell) iterator2.next();
                    System.out.println(cell.getStringCellValue());
                }
            }
            x.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






















