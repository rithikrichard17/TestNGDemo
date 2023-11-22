package com.app.TestNg.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		
		String excelfilepath = "C:\\Users\\LENOVO\\Desktop\\mytestdata\\testdata1.xlsx";
		File excelfile = new File( excelfilepath);
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//fetch the sheet name from the workbook
		
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
		
		//count the number of rows
		
		int rows = sheet.getLastRowNum();
		System.out.println("Number of Rows :"+rows);
		
		//count the coloumn
		
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println("Number of coloumns :"+col);
		
		//go to every row to fetch data
		
		for(int r=0;r<rows;r++) {
			XSSFRow row = sheet.getRow(r);
			//for loop to go to every coloumn
			for(int c=0;c<col;c++) {
				
				XSSFCell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				switch(cellType) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				}
				
				System.out.println(" ");
				
			}
			System.out.println(" ");
		}
		workbook.close();
	}
}
		
		


