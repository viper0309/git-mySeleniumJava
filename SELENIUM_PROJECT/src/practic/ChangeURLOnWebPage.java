package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChangeURLOnWebPage {
	@Test
	public void webPage(){
// change the URL on a webpage using selenium web drive
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://www.yahoo.com/");
driver.close();	
}
}