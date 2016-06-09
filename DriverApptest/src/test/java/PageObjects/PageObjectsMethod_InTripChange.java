package PageObjects;

import Base.TestBase;
import Util.KeywordDriven;

public class PageObjectsMethod_InTripChange extends TestBase {

	public void past()
	{
		//Click on past trips
		driver.findElementByName(OR.getProperty("Past")).click();
	}
	public void TripType()
	{
		//Go to past trip and click on last completed trip
		driver.findElementById(OR.getProperty("TripType")).click();
	}
	public void pending()
	{
		//Click on payment pending
		driver.findElementByName(OR.getProperty("Pending")).click();
	}
	public void toggle()
	{
		//Click on toggle
		driver.findElementById(OR.getProperty("ToggleBtn")).click();
	}
	public void change()
	{
		//Click on change
		driver.findElementById(OR.getProperty("Change")).click();
	}
	//In-trip add check
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
	public void IntripDelete()
	{
		//Click on delete icon
		driver.findElementById(OR.getProperty("Delete")).click();
	}
	public void ClickYes()
	{
		//Would you like to start the trip?
		driver.findElementByName(OR.getProperty("Yes")).click();
	}
	public void back()
	{
		//Go back to trip list view
		driver.findElementById(OR.getProperty("BackButton")).click();
	}

	public void received()
	{
		//Click on Payment Received
		driver.findElementByName(OR.getProperty("Received")).click();
	}
	public void FullAmount()
	{
		//Total payable fare check
		String ele = driver.findElementById(OR.getProperty("AmountPayable")).getText();
		//String ele = driver.findElementById(OR.getProperty("TripRevenue")).getText();
		
		System.out.println(ele);
		//Send full amount
		driver.findElementById(OR.getProperty("AmountPaid")).sendKeys(ele);
	}
	
	public void HideKeyboard()
	{
		driver.hideKeyboard();
	}

	public void submit()
	{
		//Click on submit
		driver.findElementByName(OR.getProperty("SubmitPass")).click();
	}
}
