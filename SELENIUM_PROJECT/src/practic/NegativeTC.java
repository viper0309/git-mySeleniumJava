package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeTC {
@Test
public void NegativeTC(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("http://www.gcrit.com/build3/login.php");
driver.findElement(By.name("email_address")).sendKeys("prajit@yahoo.com");	
driver.findElement(By.name("password")).sendKeys("cambodia1");	
driver.findElement(By.id("tdb5")).click();
//capture error
//String url = driver.getCurrentUrl();
//if(url.contains("http://www.gcrit.com/build3/login.php")){	
String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
//if want to change valid username can use exception or condition line18,19,
if (ErrorMessage.contains(" Error: No match for E-Mail Address and/or Password.")){
System.out.println("NagativeInput Passed");	
}
//}
else{
	System.out.println("NagativeInput Failed");		
		
	}
}
}