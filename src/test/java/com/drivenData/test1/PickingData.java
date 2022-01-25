package com.drivenData.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class PickingData {

	public static void main(String[] args) throws Exception 
	{
		String path="C://Users//91891//Desktop//Data//Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				
				System.out.print("    "+value);
			}
			System.out.println("hello");
		}
		
		
		

	}

	
}
