package TestCases;

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
import org.testng.SkipException;
import org.testng.annotations.*;

import Base.TestBase;
import PageObjects.PageObjectMethod_ChangePassword;
import Util.TestUtil;


public class Change_Password extends PageObjectMethod_ChangePassword 
{
	@BeforeMethod
	public void isSkip()
	{
		if(!TestUtil.isExecutable("Change_Password"))
		{
			throw new SkipException("Skipping the test case as Run mode is set to NO");
		}	
	}


	@Test
	public void PasswordChange() 
	{	
		if(OR.getProperty("User").equals("Driver"))
		{
			ChangePassword("test","1234");
			ChangePassword("1234", "test");
		}
		else
		{
			ChangePassword("4321","1234");
			ChangePassword("1234", "4321");
		}
	}

	public void ChangePassword(String initialpassword, String laterpassword) 
	{	
		PageObjectMethod_ChangePassword password = new PageObjectMethod_ChangePassword();
		password.MenuDrawer();
		password.ChangePasswordClick();
		password.InitialPassword(initialpassword);
		password.NewPassword(laterpassword);
		password.ReEnterPassword(laterpassword);
		password.SubmitPassword();
	}


}



