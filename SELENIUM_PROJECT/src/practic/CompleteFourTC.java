package practic;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CompleteFourTC {
	public WebDriver driver;
	@Test  (priority=1)
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
   driver = new ChromeDriver();
	}
	
	@Test (priority=2)
	public void verifyPageTittle1(){
	driver.get("https://www.google.com/");
Assert.assertEquals("Google", driver.getTitle());
	}
	@Test (priority=3)
	public void verifyPageTittle2(){
		driver.navigate().to("https://www.yahoo.com/");
	Assert.assertEquals("Yahoo", driver.getTitle());
}
@Test (priority=4)
public void closeBrowser(){
driver.close();	
}
}