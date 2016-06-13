package PageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Base.TestBase;
import Util.KeywordDriven;

public class PageObjectMethods_BookingInstationPackagae extends TestBase
{

	public void MenuDrawer()
	{
		//Open menu drawer
		driver.findElementById(OR.getProperty("MenuDrawer")).click();
	}

	public void BookTripClick()
	{
		driver.findElementByName(OR.getProperty("Booking")).click();
	}

	public void PassengerName()
	{
		driver.findElementByName(OR.getProperty("Name")).sendKeys(KeywordDriven.CUSTOMER_NAME);
	}

	public void PassengerNumber()
	{
		driver.findElementByName(OR.getProperty("Phone")).sendKeys(KeywordDriven.CUSTOMER_PHONE);
	}
	
	public void StartLocation()
	{
		driver.findElementById(OR.getProperty("StartLoc")).sendKeys(KeywordDriven.START_LOC);
	}
	
	public void StartDate()
	{
		driver.findElementById(OR.getProperty("StartDate")).click();
	}
	
	public void OK()
	{
		driver.findElementByName(OR.getProperty("Ok")).click();
	}
	
	public void StartTime()
	{
		driver.findElementById(OR.getProperty("StartTime")).click();
	}
	
	public void PM()
	{
		driver.findElementByName(OR.getProperty("PM")).click();
	}
	
	public void selectHour() throws InterruptedException
	{
		/*WebElement date = driver.findElementById("android:id/numberpicker_input");
		Thread.sleep(10000);
		date.sendKeys("10");*/
		
		/*WebElement hour = driver.findElementById("android:id/numberpicker_input");
		int count = Integer.parseInt((hour.getText()));
		System.out.println("newval" +count);*/
		driver.findElementByName("4").click();
	}
	public void EndLocation()
	{
		driver.findElementById(OR.getProperty("EndLoc")).sendKeys(KeywordDriven.END_LOC);
	}
	
	public void EndDate()
	{
		driver.findElementById(OR.getProperty("EndDate")).click();;
	}
	
	public void EndTime()
	{
		driver.findElementById(OR.getProperty("EndTime")).click();;
	}
	
	public void selectEndHour() throws InterruptedException
	{
		driver.findElementByName("5").click();
	}
	
	public void Round_Trip()
	{
		driver.findElementByName(OR.getProperty("RoundTrip")).click();
	}
	
	public void fixedPrice()
	{
		driver.findElementByName(OR.getProperty("FixedPrice")).click();
	}
	
	public void selectPackageType()
	{
		driver.findElementByName(OR.getProperty("PackageType")).click();
	}
	
	public void dropdownSelectionFixed()
	{
		driver.findElementByXPath(OR.getProperty("FixedPricePackage")).click();
	}
	
	public void bookme()
	{
		driver.findElementByName(OR.getProperty("TripBooking")).click();
	}
	
	public void tripIDView()
	{
		String TripID = driver.findElementById(OR.getProperty("TripIDDisplay")).getText();
		System.out.println("Trip ID is = " +TripID);
	}
	
	public void selectVehicle()
	{
		driver.findElementById(OR.getProperty("SelectVehicle")).click();
	}
	
	public void vehicleDropDown()
	{
		driver.findElementById(OR.getProperty("VehicleSelection")).click();
	}
	
	public void selectDriver()
	{
		driver.findElementById(OR.getProperty("SelectDriver")).click();
	}
	
	public void driverDropDown()
	{
		driver.findElementById(OR.getProperty("DriverSelection")).click();
	}
	
	public void swipingVertical() throws InterruptedException 
	{
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		  //Find swipe start and end point from screen's with and height.
		  //Find starty point which is at bottom side of screen.
		  int starty = (int) (size.height * 0.80);
		  //Find endy point which is at top side of screen.
		  int endy = (int) (size.height * 0.20);
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx = size.width / 2;
		  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		  //Swipe from Bottom to Top.
		  driver.swipe(startx, starty, startx, endy, 3000);
		  Thread.sleep(2000);
	}
	
	public void HideKeyboard()
	{
		driver.hideKeyboard();
	}
	
	public void done()
	{
		driver.findElementByName(OR.getProperty("Done")).click();
	}
	
	
}
