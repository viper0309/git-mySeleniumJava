package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleLink {
//click,check link existence,check enable staus,return linkName
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
//driver.findElement(By.linkText("Images")).click();
WebElement google_images=driver.findElement(By.linkText("Images"));
boolean linkstatus=google_images.isDisplayed();
System.out.println(linkstatus);
linkstatus=google_images.isEnabled();
System.out.println(linkstatus);
//wriiten linkName using string
String linkName=google_images.getText();
System.out.println(linkName);
google_images.click();
}
}