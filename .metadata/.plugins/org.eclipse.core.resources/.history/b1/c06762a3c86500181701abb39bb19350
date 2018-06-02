package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendarByJS {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(), 'Calendar')]")).click();
		
		String date="29-June-2018";
		String array[] =date.split("-");
		
		String day=array[0];
		String month=array[1];
		String year=array[2];
		
		Select selectMonth= new Select(driver.findElement(By.name("slctMonth")));
		selectMonth.selectByVisibleText(month);
		
		Select selectYearh= new Select(driver.findElement(By.name("slctMonth")));
		selectMonth.selectByVisibleText(year);
		
		
		
		
	}

}
