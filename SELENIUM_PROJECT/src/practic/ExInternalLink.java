package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExInternalLink {
	@Test
	public void Basic() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Create account")).click();
	driver.navigate().back();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("seleniumhq.org")).click();
	}
}