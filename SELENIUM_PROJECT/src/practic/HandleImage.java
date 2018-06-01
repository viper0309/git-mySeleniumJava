package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleImage {
//3 type of image elements(general image=no functionlity), image button(submit),image link(redirect to other page/location)
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
System.out.println(driver.findElement(By.id("hplogo")).getAttribute("alt"));
//now navigate to other page
driver.navigate().to("http://newtours.demoaut.com/");
driver.findElement(By.name("login")).click();	
driver.navigate().to("http://www.seleniumhq.org/");
driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
	
	
	}
}