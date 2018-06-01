package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookPage {
	static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shreya");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("madan");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("srya@gmail.com");
	
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sreynga1");
	
	Select select=new Select(driver.findElement(By.name("birthday_month")));
	
	select.selectByVisibleText("Jun");
	Select select1=new Select(driver.findElement(By.name("birthday_day")));
	select1.selectByValue("23");
	Select select2=new Select(driver.findElement(By.name("birthday_year")));
	select2.selectByValue("1988");
	
	
	int year=1988;
	if(year==1988) {
		System.out.println("this is correct year "+ year);
	}
	driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/span/span[2]")).click();
	JavascriptExecutor ex= (JavascriptExecutor) driver ;
	ex.executeScript("window.scrollBy(0,250)", "");
		
		
	
	}

}

