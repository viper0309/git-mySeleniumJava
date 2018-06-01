package practic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TextIsUnderlineOrNot {
	//Ans- Identify by getCssValue(“border-bottom”) or sometime getCssValue(“text-decoration”) method if the   
	//ex- This is for when moving cursor over element that is going to be underlined or not-  
  @Test
  
 public void underlineText(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
	driver.get("https://www.google.com/"); 
	
	String cssValue= driver.findElement(By.linkText("Gmail")).getCssValue("textdecoration");   
	System.out.println("value"+cssValue); 
	
	Actions act = new Actions(driver);  
	act.moveToElement(driver.findElement(By.linkText("Gmail"))).perform();   
	
	String cssValue1= driver.findElement(By.linkText("Gmail")).getCssValue("textdecoration");  
	System.out.println("value over"+cssValue1);  
	
	driver.close();   

}
}