package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleButton {//purpose of button is summit
	
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
driver.findElement(By.id("next")).click();
System.out.println(driver.findElement(By.id("next")).isDisplayed());	

System.out.println(driver.findElement(By.id("next")).isEnabled());	

System.out.println(driver.findElement(By.id("next")).getAttribute("type"));	

System.out.println(driver.findElement(By.id("next")).getAttribute("name"));	

System.out.println(driver.findElement(By.id("next")).getAttribute("value"));	
}
}