package com.learnautomation.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	 FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\Desktop\\animation.xlsx");
	 
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		
		int sheetcount=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetcount;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator <Row> rows=sheet.iterator();
		Row firstrow=rows.next();
			
			}
			
		}
		
		
		

	}

}
