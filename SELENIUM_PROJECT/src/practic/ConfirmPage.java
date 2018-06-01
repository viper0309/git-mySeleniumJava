package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ConfirmPage {
	@Test
	public void BasicMain() throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/");	
driver.findElement(By.linkText("create an account")).click();
driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
driver.findElement(By.name("firstname")).sendKeys("alyssa");	
driver.findElement(By.name("lastname")).sendKeys("made");	
driver.findElement(By.id("dob")).sendKeys("10/20/1980");
driver.findElement(By.name("email_address")).sendKeys("alyssa4@yahoo.com");
driver.findElement(By.name("street_address")).sendKeys("abdxyz");	
driver.findElement(By.name("postcode")).sendKeys("19438");	
driver.findElement(By.name("city")).sendKeys("lansdale");	
driver.findElement(By.name("state")).sendKeys("new jersey");	

//drop down field
Select DropDown = new Select (driver.findElement(By.name("country")));
DropDown.selectByVisibleText("United States");	
driver.findElement(By.name("telephone")).sendKeys("12345656677");	
driver.findElement(By.name("password")).sendKeys("abc123");	
driver.findElement(By.name("confirmation")).sendKeys("abc123");	
Thread.sleep(3000);
driver.findElement(By.id("tdb4")).click();	

//write verification point
//email address need to change
String ConfirmationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
//verification point condition
if(ConfirmationMessage.equals("Your Account Has Been Created!")){
	System.out.println("Registeration Passed");
}
else{
	System.out.println("Registeration Failed");	
}
driver.close();
	}
}
//.//*[@id='bodyContent']/h1