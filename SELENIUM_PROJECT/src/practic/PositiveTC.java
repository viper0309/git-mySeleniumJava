package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTC {
@Test
public void PositiveTC(){	
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.gcrit.com/build3/login.php");
driver.findElement(By.name("email_address")).sendKeys("prajit0@yahoo.com");	
driver.findElement(By.name("password")).sendKeys("cambodia1");	
driver.findElement(By.id("tdb5")).click();
//capture url
String url = driver.getCurrentUrl();

if (url.equals("http://www.gcrit.com/build3/index.php")){
System.out.println("Login Passed");	
}
else{
	System.out.println("Login Failed");		
}


}	
}
//http://www.gcrit.com/build3/index.php