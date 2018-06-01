package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getTextDemo {
	
	static WebDriver driver;

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Sell')]")).click();
		
		String tileNAme=driver.getCurrentUrl();
		
		Assert.assertEquals(tileNAme, "https://www.freecrm.com/index.html");
		
		
		
	}
}
		