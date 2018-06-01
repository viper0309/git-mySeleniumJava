package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Test1 {
	@Test
	
	public void basicTestDemo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.walmart.com/account/login?ref=domain");
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[1]/label/div/input")).sendKeys("prajit0@yahoo.com");	
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[2]/div/label[1]/div/input")).sendKeys("cambodia1");	
	
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[4]/button")).click();

}
}