package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();

		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		//WebElement Gmail = driver.findElement(By.id("Gmail"));//can perform directly using thus webelement
		//Gmail.sendKeys("Shreya");//option2=to perform multiple operation on same element
		//Gmail.clear();//want to clear first operation

		//String Tittle = driver.getTitle();
		//Assert.assertEquals(Tittle, "google");//keep it the las line if you want to perform
		driver.findElement(By.name("Email")).sendKeys("Shreya");//option1	
		//driver.findElement(By.id("Email")).clear();		
		driver.close();
			}
		
		
	}


