package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleInLineElement {
//the span tag is use to group inline element in a document
	@Test
	public void loginPage() throws InterruptedException{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();

Thread.sleep(5000);
driver.findElement(By.className("gb_3")).click();

driver.navigate().back();








}
}