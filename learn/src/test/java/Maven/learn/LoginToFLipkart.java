package Maven.learn;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToFLipkart {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com/");
		/*driver.manage().window().maximize();*/

		/*WebElement hover = driver.findElement(By.linkText("ELECTRONICS"));
		Actions act = new Actions(driver);
		act.moveToElement(hover).build().perform();;

		driver.findElement(By.linkText("Samsung")).click();
		driver.findElement(By.linkText("Samsung Galaxy On7 (Gold, 8 GB)")).click();*/

		WebElement ele = driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[2]/div/form/div/input"));
		ele.click();
		ele.sendKeys("nokia");

		driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[2]/div/form/input[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Vertical scroll - down by 150  pixels
		js.executeScript("window.scrollBy(0,200)");
		/*
		driver.findElement(By.xpath(".//*[@id='brand']/li[2]/a/input")).click();*/

		List<WebElement> kk = (driver.findElements(By.cssSelector(".pu-final")));
		System.out.println(kk.size());
		for(int i = 1; i<kk.size(); i++)
		{		
			System.out.println(kk.get(i).getText());
		}



		/*		driver.findElement(By.id("MOBE4T6VHGWGJMVT")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("MOBDPGRZFDZC4NRH")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Compare")).click();
		 */	}
}