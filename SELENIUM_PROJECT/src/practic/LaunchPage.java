package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchPage {
	@Test
	
	public void basicTestDemo() throws InterruptedException{
	System.setProperty("webdriver.firefox.marionette","D:\\Selenium jars-latest\\gekhodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	Thread.sleep(5000); // static wait
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("sukkumar3");
	driver.findElement(By.name("pass")).sendKeys("xxxx");
	driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	String url = driver.getCurrentUrl();
	if (url.equals("http://www.fb.com")){
		System.out.println("Login Passed");	
		}
		else
		{
			System.out.println("Login Failed");
		}
	//driver.close();
	

	//public static void main(String[] args) {
		
		
		
		
	}

}
