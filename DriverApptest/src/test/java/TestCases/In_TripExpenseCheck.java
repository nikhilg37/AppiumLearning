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
public class In_TripExpenseCheck extends PageObjectsMethods_TripFlow
{
	@BeforeMethod
	public void isSkip()
	{
		if(!TestUtil.isExecutable("In_TripExpenseCheck"))
		{
			throw new SkipException("Skipping the test case as Run mode is set to NO");
		}	
	}

	@Test
	public void start_intrip_end()
	{	
		PageObjectsMethods_TripFlow trips = new PageObjectsMethods_TripFlow();

		//Start Trip flow
		trips.tripID();
		trips.AcceptTrips();
		trips.StartTrip();
		trips.ClickYes();
		trips.StartOdo();
		trips.SubmitOdo();

		//Intrip Flow
		trips.ClickInTrip();
		//1st in trip money
		trips.TripAmt();
		trips.TripReasonClick();;
		trips.TripReasonsSelect();
		trips.date();
		// this is for moto G trips.OK();
		trips.done();
		trips.Add();
		//2nd in trip money
		trips.TripAmt();
		trips.TripReasonClick();;
		trips.TripReasonsSelect();
		trips.date();
		// this is for moto G trips.OK();
		trips.done();
		//in-trip delete
		trips.IntripDelete();
		trips.ClickYes();
		trips.back();

		//End Trip flow
		trips.EndTrip();
		trips.ClickYes();
		trips.EndOdo();
		trips.SubmitOdo();
		trips.TripStatus();
		trips.back();
	}
}
