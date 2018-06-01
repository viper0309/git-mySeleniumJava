package practic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowPopUp {
	@Test
public void BasicMain() throws InterruptedException{		
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
Alert alt = driver.switchTo().alert();
Thread.sleep(5000);
//create instance using this instance 
//i want to capture that error meesage
String Error_Message = alt.getText();//return error message
System.out.println(Error_Message);
//i want to close erroe popup ans continue execution
alt.dismiss();//closed/cancel popup window
//alt.accept();//click on ok

//then i want to enter sone value on username
driver.findElement(By.id("login1")).sendKeys("alyssa123");
}
}