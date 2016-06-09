package PageObjects;

import Base.TestBase;

public class PageObjectMethod_ChangePassword extends TestBase{

	public void MenuDrawer()
	{
		//Open menu drawer
		driver.findElementById(OR.getProperty("MenuDrawer")).click();
	}

	public void ChangePasswordClick()
	{
		//Clicking on changing password
		driver.findElementByName(OR.getProperty("ChangePassword")).click();
	}

	public void InitialPassword(String initialpassword)
	{
		//Enter current password
		driver.findElementById(OR.getProperty("InitialPass")).sendKeys(initialpassword);
	}

	public void NewPassword(String laterpassword)
	{
		//Enter new password
		driver.findElementById(OR.getProperty("NewPass")).sendKeys(laterpassword);
	}


	public void ReEnterPassword(String laterpassword)
	{
		//Re-enter new password
		driver.findElementById(OR.getProperty("ReEnterNewPass")).sendKeys(laterpassword);
	}

	public void SubmitPassword()
	{
		//Click on submit
		driver.findElementByName(OR.getProperty("SubmitPass")).click();
	}
}

