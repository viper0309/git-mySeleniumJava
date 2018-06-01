package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//how to identify tagName using <> or input
public class ByTagName {
	@Test
	public void loginPage(){ 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://www.bankofamerica.com/");
		/*WebElement Gmail = driver.findElement(By.id("Gmail"));//can perform directly using thus webelement
		Gmail.sendKeys("Shreya");//option2=to perform multiple operation on same element
		Gmail.clear();//want to clear first operation
*/
		//String Tittle = driver.getTitle();
		//Assert.assertEquals(Tittle, "google");//keep it the las line if you want to perform
		driver.findElement(By.tagName("input")).sendKeys("Shreya");//option1	
		//driver.findElement(By.tagName("Email")).clear();		
		driver.close();	
	
	}

}
