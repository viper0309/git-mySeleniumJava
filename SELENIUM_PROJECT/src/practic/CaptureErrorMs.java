package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureErrorMs {
//first need to find element on signin button then	
	@Test
	public void BasicMain() throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
driver.findElement(By.id("next")).click();
Thread.sleep(4000);
String ErrorMessage = driver.findElement(By.id("errormsg_0_Email")).getText();
System.out.println(ErrorMessage);
}
}