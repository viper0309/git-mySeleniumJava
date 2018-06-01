package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo1 {
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();		
driver.get("http://www.gcrit.com/build3/login.php");		
driver.findElement(By.name("email_address")).sendKeys("prajit7@yahoo.com");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb5")).click();
//verification required capture everything
String url = driver.getCurrentUrl();

if (url.equals("http://www.gcrit.com/build3/index.php")){
System.out.println("passed");
}
else{
	System.out.println("failed");	
	
}
}

}


//http://www.gcrit.com/build3/login.php