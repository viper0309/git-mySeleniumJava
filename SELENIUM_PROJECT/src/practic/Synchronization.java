package practic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Synchronization {
	@Test
	public void NegativeTC(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Create account")).click();
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(arg0)
	}

}