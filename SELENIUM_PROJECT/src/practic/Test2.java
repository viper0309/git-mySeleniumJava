package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	
@Test
//public static void main(String[] args) {
public void loginPage(){
	
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.get("https://www.facebook.com");
String Tittle = driver.getTitle();
Assert.assertEquals(Tittle, "facebook");
driver.close();
		
					
					//firefox driver
					//System.setProperty("webdriver.firefox.marionette","D:\\Selenium jars-latest\\gekhodriver.exe");
					//driver = new FirefoxDriver();
						
					//ie driver
					//System.setProperty("webdriver.ie.driver","D:\\Selenium jars-latest\\IEDriverServer.exe");
					//driver = new InternetExplorerDriver();
		
		
		
		
		
	}

}
