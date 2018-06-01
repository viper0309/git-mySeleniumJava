package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://groups.spicejet.com/");
		
		Actions mouseHover1= new Actions(driver);
		mouseHover1.moveToElement(driver.findElement(By.linkText("Investors"))).build().perform();
		Thread.sleep(2000);
		mouseHover1.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[2]/div[2]/div/ul/li[4]/ul/li[2]/a")))
		.build().perform();
		mouseHover1.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[2]/div[2]/div/ul/li[4]/ul/li[2]/ul/li[1]/a")))
		.build().perform();
		
		mouseHover1.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Annual Report 2013-14 ')]"))).click();
		
		
	
	}

}
