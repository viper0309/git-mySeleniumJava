package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class VerifyEleExtistence {
	@Test
	public void BasicMain(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	//verify the existence in boolean
boolean existence =	driver.findElement(By.linkText("Gmail")).isDisplayed();
if (existence == true){	//single = is assigment double == equal to
//write condtion directly
	//if (driver.findElement(By.linkText("Gmail")).isDisplayed()){
	System.out.println("Gmail link exist - Passed");
		}
	else {
		System.out.println("Gmail link exist - Failed");	
	}
		}
	}
