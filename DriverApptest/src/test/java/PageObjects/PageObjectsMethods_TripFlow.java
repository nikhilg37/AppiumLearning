package PageObjects;

import org.testng.Assert;

import Base.TestBase;
import Util.KeywordDriven;

public class PageObjectsMethods_TripFlow extends TestBase 
{

	public void tripID() 
	{
		//Click on first trip
		driver.findElementById(OR.getProperty("TripID")).click();
	}

	public void AcceptTrips()
	{
		//Accept trips
		driver.findElementByName(OR.getProperty("Accept")).click();
	}

	public void StartTrip()
	{
		//Click on start button
		driver.findElementByName(OR.getProperty("Start")).click();
	}

	public void ClickYes()
	{
		//Would you like to start the trip?
		driver.findElementByName(OR.getProperty("Yes")).click();
	}

	public void StartOdo()
	{
		//Enter Start odometer
		driver.findElementById(OR.getProperty("Odometer")).sendKeys(KeywordDriven.START_ODO);
	}

	public void SubmitOdo()
	{
		//Enter Submit
		driver.findElementById(OR.getProperty("Submit")).click();
	}

	//End trip functionality
	public void EndTrip()
	{
		//Click on End trip
		driver.findElementByName(OR.getProperty("End")).click();
	}		

	public void EndOdo()
	{
		//Enter End odometer
		driver.findElementById(OR.getProperty("Odometer")).sendKeys(KeywordDriven.END_ODO);
	}

	public void TripStatus()
	{
		//Validating the result
		String actual = driver.findElementById(OR.getProperty("TripStatus")).getText();
		String expected = "Payment Pending";
		Assert.assertEquals(actual, expected);
	}

	public void back()
	{
		//Go back to trip list view
		driver.findElementById(OR.getProperty("BackButton")).click();
	}
	
	public void ClickInTrip()
	{
		driver.findElementByName(OR.getProperty("IntripMoneyAdd")).click();
	}

	public void IntripDelete()
	{
		//Click on delete icon
		driver.findElementById(OR.getProperty("Delete")).click();
	}

	public void TripAmt() 
	{
		//Add amount
		driver.findElementById(OR.getProperty("TripAmount")).sendKeys(KeywordDriven.INTRIP_AMT);
	}

	public void TripReasonClick()
	{
		//Select reason
		driver.findElementById(OR.getProperty("TripReason")).click();
	}

	public void TripReasonsSelect()
	{
		//Select fuel
		driver.findElementByName(KeywordDriven.INTRIP_REASON1).click();
		//driver.findElementByName(KeywordDriven.INTRIP_REASON2).click();
	}

	public void date()
	{
		//Select date
		driver.findElementByName(OR.getProperty("Date")).click();
	}

	public void OK()
	{
		//Click on OK
		driver.findElementByName(OR.getProperty("Ok")).click();
	}

	public void Add()
	{
		//Click on ADD
		driver.findElementByName(OR.getProperty("Add")).click();
	}
}




