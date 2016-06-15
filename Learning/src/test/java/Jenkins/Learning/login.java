package Jenkins.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void launch()
	{
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("www.gmail.com");
	}
}
