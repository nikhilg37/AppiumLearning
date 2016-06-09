package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import Util.KeywordDriven;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Base.TestBase;
import Util.ExcelReader;


public class TestBase {

	public static AndroidDriver driver;
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"//src//test//java//Properties//TestData.xlsx");

	@BeforeSuite
	public void config() throws MalformedURLException
	{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("platformVesion", "5.1"); 
		capabilities.setCapability("deviceName","TA9330F7VE");
		capabilities.setCapability("platformName","Android");

		//Set up apk destination path
		File file = new File(".\\driverapk\\app-debug.apk");
		capabilities.setCapability("app", file.getAbsolutePath());

		//Connect to appium server
		driver= new AndroidDriver(new URL("http://192.168.1.128:4723/wd/hub"), capabilities);

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(35L, TimeUnit.SECONDS);

		//OR.properties file loader
		try 
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Properties//OR.properties");
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			OR.load(fis);
			log.debug("OR file loaded");
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void login()
	{
		if(OR.getProperty("User").equals("Driver"))
		{
			//Phone number validation check
			driver.findElementById(OR.getProperty("Phonenumber")).sendKeys(KeywordDriven.DRIVER_PHONENUMBER);

			//Password check
			driver.findElementById(OR.getProperty("Password")).sendKeys(KeywordDriven.DRIVER_PASSWORD);
		}
		else
		{
			//Phone number validation check
			driver.findElementById(OR.getProperty("Phonenumber")).sendKeys(KeywordDriven.FLEETOWNER_PHONENUMBER);

			//Password check
			driver.findElementById(OR.getProperty("Password")).sendKeys(KeywordDriven.FLEETOWNER_PASSWORD);
		}
		//Click on login
		driver.findElementById(OR.getProperty("LoginButton")).click();

		if(OR.getProperty("User").equals("Driver"))
		{
			//Verifying whether correct page is logged in or not!!
			WebElement element = driver.findElementById(OR.getProperty("FleetTitle"));
			String expected = element.getAttribute("text");
			String actual = "Select Fleet";
			Assert.assertEquals(actual, expected);

			//FO selection from drop down
			driver.findElementByName(OR.getProperty("FleetName")).click();
		}
	}	

	/*@AfterTest
	public void logout()
	{		
		//Open menu drawer
		driver.findElementById(OR.getProperty("MenuDrawer")).click();

		//Click on logout and click "Yes"

		driver.findElementByName(OR.getProperty("Logout")).click();
		driver.findElementByName(OR.getProperty("Yes")).click();
	}
*/}
