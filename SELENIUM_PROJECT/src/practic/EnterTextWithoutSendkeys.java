package practic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;

public class EnterTextWithoutSendkeys {
	@Test
	
	public static void setAttribute(WebElement element, String attributeName, String value)       {   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		WrapsDriver wrappedElement = (WrapsDriver) element;   
		JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();    
		driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value); 
		} 
	//call the above method in the test script and pass the text field attribute and pass the text you want to enter.
}
