package practic {

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeStatic {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	public static ChromeDriver driver;
	public PracticeStatic()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		driver = new ChromeDriver();


	}
	public void	adminLogin(ChromeDriver driver){//login with parameter//this is local if u want to make global then cancel line 14,15 replace with line 10,11	

		driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.name("email_address")).sendKeys("prajit0@yahoo.com");	
		driver.findElement(By.name("password")).sendKeys("cambodia1");	
		driver.findElement(By.id("tdb5")).click();
		adminLogin("shreya", "alyssa", driver);
	}
	public void	adminLogin(String email_address, String password, ChromeDriver driver  ){//login with parameter
		driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.name("email_address")).sendKeys(email_address);	
		driver.findElement(By.name("password")).sendKeys(password);	
		driver.findElement(By.id("tdb5")).click();
	}
	public void closeBrowser(ChromeDriver driver)
	{//closed browser

		if (! driver.toString().contains("null")){
			driver.close();	
		}
	}

	public void close()
	{
		System.out.println("hi");
	}


	public static void main(String[] args) 
	{


		PracticeStatic obj = new PracticeStatic();


		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		driver = new ChromeDriver();
	}


}
