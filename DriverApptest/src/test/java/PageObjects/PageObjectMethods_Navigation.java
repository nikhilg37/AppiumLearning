package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import Base.TestBase;

public class PageObjectMethods_Navigation extends TestBase

{
	public void today() throws InterruptedException
	{
		//Click on "today's trips"
		driver.findElementByName(OR.getProperty("Today")).click();
	}
	public void future() throws InterruptedException
	{
		//Click on "future trips"
		driver.findElementByName(OR.getProperty("Future")).click();
	}
	public void past() throws InterruptedException
	{
		//Click on "past trips"
		driver.findElementByName(OR.getProperty("Past")).click();
	}
	public void TripCount()
	{
		List <WebElement> ele = driver.findElementsById(OR.getProperty("TripCount"));
		System.out.println("Today's trip count is " +ele.get(0).getText());
		System.out.println("Future trip count is " +ele.get(1).getText());
		System.out.println("Past trip count is " +ele.get(2).getText());
	}
}
