package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Create_Data {
	
	
	public static void write_Data() throws Throwable {

		File f = new File("C:\\Users\\ELCOT\\Downloads\\New_Datas.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("User datas");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Username");
		
		wb.getSheet("User datas").getRow(0).createCell(1).setCellValue("Password");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		// write 
		
		wb.write(fos);
		
		System.out.println("Data Entered In Excel");
		
		// close
		
		wb.close();
		
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_Data();
		
	}

}
