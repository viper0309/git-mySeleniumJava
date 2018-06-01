package practic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SwitchToFrame {
//done in 2 ways(using frame index 0--1(syntax:(driver.switchto.frame(int index)	 	
//using frameName:syntax(driver.switchTo.frame(string framename
@Test
public void BasicMain() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");	
//switch to third frame
driver.switchTo().frame(2);
driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
Thread.sleep(3000);
//switch from thrid frame to top window	
driver.switchTo().defaultContent();	
//switch to first frame
Thread.sleep(3000);
driver.switchTo().frame(0);
driver.findElement(By.linkText("org.openqa.selenium.ie")).click();
	

////html frame use to devide the broswer window into multiple sections where each section can load separate html document
//frame are section off webpage displayed on top window
//whenevr we access the page then focus on the top window

//*******************************	
//first luanch the page switch to 3rd frame and operate an element back to top window again switch first frame and operation the element

	
	
	
}
}