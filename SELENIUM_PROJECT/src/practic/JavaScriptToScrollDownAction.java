package practic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptToScrollDownAction {
	@Test
	public void scrollDrown() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://www.cnn.com/");  
	
	driver.manage().window().maximize();  
	
	JavascriptExecutor jsx = (JavascriptExecutor)driver;  
	jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down  
	
	Thread.sleep(3000);  
	
	jsx.executeScript("window.scrollBy(450,0)", ""); //scroll up 
}
	
}