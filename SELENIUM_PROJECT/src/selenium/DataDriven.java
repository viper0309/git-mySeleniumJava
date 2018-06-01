package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
public static WebDriver driver;
	@Test(dataProvider="LoginPageData")
	public void loginPage(String user, String pass) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	
	Assert.assertTrue(driver.getTitle().contains("CRMPRO"), "user is not able to login");	
	
	System.out.println("user able to loin sucessfully");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

	@DataProvider(name="LoginPageData")
	public Object dataLogin() {
		
	
	Object data[][]=new Object[3][2];
	data[0][0]="naveenk1";
	data[0][1]="test@1234";
			
	data[1][0]="naveenk";
	data[1][1]="test@123";
			
	data[2][0]="shhsgs";
	data[2][1]="sffsgs";
	return data;
	}
}
