package selenium;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4gTest {
	
	public static void main(String[] args) {
		
		Logger myLog=Logger.getLogger("Log4gTest");
		
		
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		myLog.info("open chrome browser");
		
		driver.manage().window().maximize();
		myLog.info("maximize the window"); 
		
		driver.manage().deleteAllCookies();
		myLog.info("delete the cookies");
		
		driver.get("https://www.signmeup.com/#!/builderform");
		myLog.info("click on signup link");
		
		driver.findElement(By.id("email")).sendKeys("sreyngayum1784@gmail.com");
		myLog.info("enter email field");
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("shreya");
		myLog.info("enter first name field");
		
		driver.findElement(By.id("last_name")).sendKeys("madan");
		myLog.info("enter last name field");
		
		Select dropDown=new Select(driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/div/div/div[2]/form/div[5]/div/select")));
		myLog.info("handle drop down");
		
		dropDown.selectByIndex(4);
		myLog.info("select drop down");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		myLog.info("handle househouver");
		
		js.executeScript("window.scrollBy(0,250)", "");
		myLog.info("handle mouse hover");
	}

}
