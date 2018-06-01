package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement { //it find first element within current page using give loactor
//driver.findElement(by.elemenetlocator("value");
	@Test
	
	public void BasicDemo() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
driver.findElement(By.name("Email")).sendKeys("aly");
//WebElement Email = driver.findElement(By.name{"Email"));
//Email.sendKeys("aly");
Thread.sleep(4000);
driver.findElement(By.name("Email")).clear();

}
}