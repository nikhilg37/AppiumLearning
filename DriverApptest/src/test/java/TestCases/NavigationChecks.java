package TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

import Base.TestBase;
import PageObjects.PageObjectMethods_Navigation;
import Util.TestUtil;

public class NavigationChecks extends PageObjectMethods_Navigation 
{	
	@BeforeMethod
	public void isSkip()
	{	
		if(!TestUtil.isExecutable("NavigationChecks"))
		{
				throw new SkipException("Skipping the test case as Run mode is set to NO");
		}	
	}
	
	@Test
	public void navigate() throws InterruptedException
	{
	//Start POM
	PageObjectMethods_Navigation count = new PageObjectMethods_Navigation();
	count.today();
	count.future();
	count.past();
	count.TripCount();
	}
	
}