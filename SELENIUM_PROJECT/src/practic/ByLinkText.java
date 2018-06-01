package practic;
//linktext for text link (eg) for google it visible link in the googple page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ByLinkText {
	@Test
	public void loginPage(){ 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://www.bankofamerica.com/");
		
		driver.findElement(By.linkText("Small Business")).click();
				
		driver.close();	
}
}