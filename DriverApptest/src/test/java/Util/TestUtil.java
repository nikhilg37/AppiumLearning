package Util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.TestBase;

public class TestUtil extends TestBase{
	
	//run-mode is executable?
	
		public static boolean isExecutable(String tcid){
			
			
			for(int rownum = 2; rownum <=excel.getRowCount("test_suite");rownum++){
				
				
				if(excel.getCellData("test_suite", "tcid", rownum).equals(tcid)){
					
					
					if(excel.getCellData("test_suite", "runmode", rownum).equals("Y")){
						
						return true;
						
					}
					else 
					{
						return false;
					}
				}
				
				
			}
			return false;
			
		}	
		
		
		// reading data from excel file
		public static Object[][] getData(String sheetName){
			
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		Object data[][] = new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum <= rows; rowNum++){
			
			for (int colNum =0; colNum<cols; colNum++){
				
				data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
				
			}
			
		}
		
		return data;
		
	}
		
	public static String currentDate(){
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    String strDate = sdf.format(cal.getTime());
	    return strDate;
			
	}
	
	public static String emailFormatDate(){
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	    String strDate = sdf.format(cal.getTime());
	    return strDate;
			
	}		
}

		


