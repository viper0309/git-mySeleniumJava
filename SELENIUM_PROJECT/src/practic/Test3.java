package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
	
	public void basicTestDemo(){
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium jars-latest\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");			
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(5000); // static wait
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("sukkumar3");
		driver.findElement(By.name("pass")).sendKeys("xxxx");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		driver.close();
		

}
}