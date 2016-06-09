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
import org.testng.SkipException;
import org.testng.annotations.*;

import PageObjects.PageObjectsMethod_InTripChange;
import Util.TestUtil;


public class In_tripChange extends PageObjectsMethod_InTripChange
{
	@BeforeMethod
	public void isSkip()
	{
		if(!TestUtil.isExecutable("In_tripChange"))
		{
			throw new SkipException("Skipping the test case as Run mode is set to NO");
		}	
	}

	// This test case changes the in-trip amount and pays full amount in payment section
	@Test
	public void Intrip_FullPay() throws InterruptedException

	{	
		PageObjectsMethod_InTripChange intrip = new PageObjectsMethod_InTripChange();
		intrip.past();
		intrip.TripType();
		intrip.pending();
		intrip.toggle();
		intrip.change();

		//intrip add and delete
		intrip.TripAmt();
		intrip.TripReasonClick();
		intrip.TripReasonsSelect();
		intrip.date();
		intrip.OK();
		intrip.Add();
		intrip.IntripDelete();
		intrip.ClickYes();
		intrip.back();

		//Full payment
		intrip.received();
		Thread.sleep(10000);
		intrip.FullAmount();
		intrip.HideKeyboard();
		intrip.submit();

	}
}

