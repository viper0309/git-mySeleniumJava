package practic;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDefinedMethodTC {

	// System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	public static WebDriver driver;

	public void launchBrowser() {// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDownload\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void adminLogin() {// login with parameter//this is local if u want
								// to make global then cancel line 14,15 replace
								// with line 10,11

		driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.name("email_address")).sendKeys("prajit0@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("cambodia1");
		driver.findElement(By.id("tdb5")).click();
	}

	public void adminLogin(String email_address, String password) {// login with
																	// parameter
		driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.name("email_address")).sendKeys(email_address);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb5")).click();
	}

	public void closeBrowser() {// closed browser

		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	public static void main(String[] args) {
		UserDefinedMethodTC obj = new UserDefinedMethodTC();
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		obj.adminLogin("prajit0@yahoo.com", "cambodia1");
		obj.closeBrowser();

	}
}
