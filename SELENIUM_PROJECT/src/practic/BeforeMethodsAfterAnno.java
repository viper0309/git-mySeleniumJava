package practic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodsAfterAnno {
	public WebDriver driver;
	@BeforeMethod//pre-condition every testcase in class/program
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
   driver = new ChromeDriver();
	}
	
	@Test (priority=2)
	public void verifyPageTittle1(){
	driver.get("https://www.google.com/");
Assert.assertEquals("Google", driver.getTitle());
	}
	@Test (priority=3)
	public void verifyPageTittle2(){
		driver.get("https://www.yahoo.com/");
	Assert.assertEquals("Yahoo", driver.getTitle());
}
@AfterMethod //post-condition every testcase in class/program
public void closeBrowser(){
driver.close();	
}
//@test,@beforemethod,@aftermethod,@beforeclass.@afterclss
}//@beforeclass..all testcase
