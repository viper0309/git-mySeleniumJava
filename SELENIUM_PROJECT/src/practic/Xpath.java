package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Xpath {//in XML document show the direction of wed appliaction element location
//most of time xpath is unique if you not able to recognize using name,id or other locator
	@Test
	public void loginPage(){ 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://www.bankofamerica.com/");
		
		driver.findElement(By.xpath(".//*[@id='hp-section-1']/div[1]/div[1]/ul/li[2]/a")).click();	
		//driver.findElement(By.id("Email")).clear();		
		driver.close();	
	}
	
}
