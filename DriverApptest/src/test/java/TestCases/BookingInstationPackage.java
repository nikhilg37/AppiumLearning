package TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

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
import PageObjects.PageObjectMethods_BookingInstationPackagae;
import Util.TestUtil;

public class BookingInstationPackage extends PageObjectMethods_BookingInstationPackagae
{

	@Test
	public void booking() throws InterruptedException
	{
		PageObjectMethods_BookingInstationPackagae bookinstpack = new PageObjectMethods_BookingInstationPackagae();
		bookinstpack.MenuDrawer();
		bookinstpack.BookTripClick();
		
		bookinstpack.PassengerName();
		Thread.sleep(5000);
		bookinstpack.HideKeyboard();
		//driver.navigate().back();
		
		bookinstpack.PassengerNumber();
		Thread.sleep(5000);
		//bookinstpack.HideKeyboard();
		driver.navigate().back();
		
		bookinstpack.StartLocation();
		Thread.sleep(10000);
		driver.navigate().back();
		
		bookinstpack.StartDate();
		Thread.sleep(5000);
		bookinstpack.done();
		Thread.sleep(5000);
		bookinstpack.done();
		Thread.sleep(5000);
		
		bookinstpack.StartTime();
		Thread.sleep(5000);
		
		bookinstpack.selectHour();
		Thread.sleep(5000);
		bookinstpack.done();
		
		bookinstpack.EndLocation();
		Thread.sleep(10000);
		bookinstpack.HideKeyboard();
		Thread.sleep(10000);
		
		bookinstpack.EndDate();
		Thread.sleep(5000);
		bookinstpack.done();
		Thread.sleep(5000);
		bookinstpack.done();
		Thread.sleep(5000);
		
		bookinstpack.EndTime();
		Thread.sleep(5000);
		
		bookinstpack.selectEndHour();
		Thread.sleep(10000);
		bookinstpack.done();
		
		bookinstpack.Round_Trip();
		Thread.sleep(5000);
		
		bookinstpack.fixedPrice();
		Thread.sleep(5000);
		
		bookinstpack.swipingVertical();
		Thread.sleep(5000);
		
		bookinstpack.selectPackageType();
		Thread.sleep(5000);
		
		bookinstpack.dropdownSelectionFixed();
		Thread.sleep(5000);
		
		bookinstpack.bookme();
		Thread.sleep(5000);
		
		bookinstpack.tripIDView();
		Thread.sleep(5000);
		
		bookinstpack.selectVehicle();
		Thread.sleep(5000);
		
		bookinstpack.vehicleDropDown();
		Thread.sleep(5000);
		
		bookinstpack.selectDriver();
		Thread.sleep(5000);
		
		bookinstpack.driverDropDown();
		Thread.sleep(5000);
		
	}
}
