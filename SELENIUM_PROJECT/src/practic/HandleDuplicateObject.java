package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleDuplicateObject {
	

@Test
public void loginPage() throws InterruptedException{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/login.php");
driver.findElement(By.name("email_address")).sendKeys("prajit0@yahoo.com");
driver.findElement(By.name("password")).sendKeys("cambodia1");;
driver.findElement(By.id("tdb5")).click();
String url = driver.getCurrentUrl();
//write 1 way condition
if (url.equals("http://www.gcrit.com/build3/account.php")){
	
}
Thread.sleep(5000);
driver.findElement(By.linkText("Catalog")).click();
System.out.println(driver.getCurrentUrl());

}
}