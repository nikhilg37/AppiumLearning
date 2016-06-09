package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Parameterization {
	
	
	public static ExcelReader excel;
	public static AndroidDriver driver;
	
	
	@Test(dataProvider="getData")
	public void testData(String Username1,String Password1)
	{
		
	}
		
	
	@DataProvider
	public static Object[][] getData(){
		
		
		
		if(excel==null){
			
			excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\Properties\\TestData.xlsx");
		}
		
		
		String sheetName = "LoginDriver";
		
		int rows = excel.getRowCount(sheetName);
		//System.out.println("Total rows are : "+rows);
		int cols = excel.getColumnCount(sheetName);
		//System.out.println("Total cols are : "+cols);
		Object[][] data = new Object[rows-1][cols];
		
	
		

		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			}
		}
		
		
	return data;
		
		
		
		
		
	}

}
