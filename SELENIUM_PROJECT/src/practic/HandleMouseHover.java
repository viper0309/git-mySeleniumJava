package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleMouseHover {//not element it an event

	@Test
public void BasicMain() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.bankofamerica.com/");
//create action builder instance by passing weddriver instance
Actions mouseHover = new Actions(driver);
//create webelement
WebElement creditCards  = driver.findElement(By.linkText("Credit Cards"));
mouseHover.moveToElement(creditCards).build().perform();
driver.findElement(By.linkText("Popular Credit Cards")).click();

}
}