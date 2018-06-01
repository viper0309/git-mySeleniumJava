package FreeCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FreeCREMLogin {
	WebDriver driver;

	@Test(dataProvider="FreeCRMdata")
	public void loginFreeCRM(String user, String pass) throws InterruptedException {
		
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
	
	
	
	@DataProvider(name="FreeCRMdata")
	public static Object[][] passData() {
		
		
		Object[][] data=new Object[4][2];
		data [0][0]="naveenk1";
		data [0][1]="test@12311";
		
		data [1][0]="naveenk";
		data [1][1]="test@123";
		
		data [2][0]="naveenk2";
		data [2][1]="test@1232";
		
		data[3][0]="alyssa";
		data[3][1]="alyssa";
		return data;
	}
}
