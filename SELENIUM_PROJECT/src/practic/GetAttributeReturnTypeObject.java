package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttributeReturnTypeObject {//get text not showing
@Test
public void loginPage(){	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
WebElement Email = driver.findElement(By.xpath(".//*[@id='Email']"));
Email.sendKeys("alyssa");
Email.getAttribute("type");	
//driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("alyssa");
//return type of the object
//driver.findElement(By.xpath(".//*[@id='Email']")).getAttribute("type");
//return display status
System.out.println(Email.isDisplayed());//true
//return enable status
System.out.println(Email.isEnabled());//true
//return the value
String text=Email.getText();//you can use many string for many use
System.out.println(text);
//System.out.println(Email.getText());//replace for two statement
}
}