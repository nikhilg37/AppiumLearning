package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Base 
{
	public static AndroidDriver driver;
	public static Properties OR = new Properties();

	@Test
	public void setup() throws MalformedURLException
	{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("platformVesion", "5.1"); 
		capabilities.setCapability("deviceName","TA9330F7VE");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.bt.bms");
		capabilities.setCapability("appActivity", "com.bt.bms.activities.MainTabActivity");
		driver= new AndroidDriver(new URL("http://192.168.1.128:4723/wd/hub"), capabilities);

	}

}
