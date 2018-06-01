package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class BrowserDriver {
WebDriver driver;

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.signmeup.com/#!/builderform");
		driver.findElement(By.id("email")).sendKeys("sreyngayum1784@gmail.com");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("shreya");
		driver.findElement(By.id("last_name")).sendKeys("madan");
		Select dropDown=new Select(driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/div/div/div[2]/form/div[5]/div/select")));
		dropDown.selectByIndex(4);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
	
		
	}
	

}
