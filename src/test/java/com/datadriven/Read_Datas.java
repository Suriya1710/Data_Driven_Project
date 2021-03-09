package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Datas {

	public static void particular_Data() throws Throwable {

		File f = new File("C:\\Eclipse\\Demo\\DataDriven_Framework\\User_Datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int value = (int) numericCellValue; // narrowing type casting

			System.out.println(value);
		}

	}

	public static void all_Data() throws Throwable {

		File f = new File("C:\\Eclipse\\Demo\\DataDriven_Framework\\User_Datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {

			Row row = sheetAt.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}

				else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue;

					System.out.println(value);

				}

			}

		}

	}

	public static void main(String[] args) throws Throwable {

		particular_Data();

		all_Data();

	}

}
