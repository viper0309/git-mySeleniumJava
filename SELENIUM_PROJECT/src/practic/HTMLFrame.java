package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HTMLFrame{
@Test
public void main() throws InterruptedException 	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");	
//switch to third frame
Thread.sleep(3000);
driver.switchTo().frame("classFrame");
driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
//switch from thrid frame to top window	//switch back from a frame
driver.switchTo().defaultContent();	
//switch to first frame
Thread.sleep(3000);
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("org.openqa.selenium.ie")).click();

}
}	
	
	
	
	
	
	


