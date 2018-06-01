package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionInTestCase {//check for element existence
	@Test
	public void BasicMain(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
//want emssage not error message
try	
{
//write condtion directly
if (driver.findElement(By.linkText("Gmailex")).isDisplayed()){//
System.out.println("Gamil link exist - Passed");
}
}//try block
catch (NoSuchElementException a)//catch block find no such element
{
System.out.println("Gmail link exist - Failed");	
	}
System.out.println(driver.getCurrentUrl());
		}
	}

