package practic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BycssSelector {
	@Test

	public void loginPage(){ 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();

		driver.get("https://www.bankofamerica.com/");
		
		//String Tittle = driver.getTitle();
		//Assert.assertEquals(Tittle, "google");//keep it the las line if you want to perform
		driver.findElement(By.cssSelector("a[name='global_smallbusiness']")).click();//change the 
		
		//driver.findElement(By.id("Email")).clear();		
		driver.close();
}
}	
	


