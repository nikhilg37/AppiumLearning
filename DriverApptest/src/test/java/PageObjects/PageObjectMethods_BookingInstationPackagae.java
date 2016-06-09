package PageObjects;

import org.openqa.selenium.WebElement;

import Base.TestBase;

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
		driver.findElementByName(OR.getProperty("Name")).sendKeys("mustafizur");
	}

	public void PassengerNumber()
	{
		driver.findElementByName(OR.getProperty("Phone")).sendKeys("003000020000");
	}
	
	public void StartLocation()
	{
		driver.findElementById(OR.getProperty("StartLoc")).sendKeys("Marathalli , Bengaluru");
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
		driver.findElementByName("5").click();
	}
	public void EndLocation()
	{
		driver.findElementById(OR.getProperty("EndLoc")).sendKeys("MGRoad , Bengaluru");
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
		driver.findElementByName("6").click();
	}
	
	public void Round_Trip()
	{
		driver.findElementByName(OR.getProperty("RoundTrip")).click();
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
