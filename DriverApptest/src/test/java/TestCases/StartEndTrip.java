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

import PageObjects.PageObjectsMethods_TripFlow;
import Util.TestUtil;

// It contains code for starting ,ending, adding deleting in-trip in trip details page
public class StartEndTrip extends PageObjectsMethods_TripFlow
{
	@BeforeMethod
	public void isSkip()
	{
		if(!TestUtil.isExecutable("StartEndTrip"))
		{
			throw new SkipException("Skipping the test case as Run mode is set to NO");
		}	
	}
	
	@Test
	public void start_end_trip()
	{
		PageObjectsMethods_TripFlow trips = new PageObjectsMethods_TripFlow();
		
		//Start trip flow
		trips.tripID();
		trips.AcceptTrips();
		trips.StartTrip();
		trips.ClickYes();
		trips.StartOdo();
		trips.SubmitOdo();
		
		//End trip flow
		trips.EndTrip();
		trips.ClickYes();
		trips.EndOdo();
		trips.SubmitOdo();
		trips.TripStatus();
		trips.back();
	}
}
