package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass {
	public static WebDriver driver;

	public void launchBrowser() {// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void adminLogin() {// login with parameter//this is local if u want
								// to make global then cancel line 14,15 replace
								// with line 10,11

		driver.get("https://www.walmart.com/account/login?ref=domain");
		driver.get("https://www.walmart.com/account/login?ref=domain");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[1]/label/div/input"))
				.sendKeys("prajit0@yahoo.com");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[2]/div/label[1]/div/input"))
				.sendKeys("cambodia1");

		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[4]/button")).click();
	}

	public void adminLogin(String email_address, String password) {// login with
																	// parameter
		driver.get("https://www.walmart.com/account/login?ref=domain");
		driver.get("https://www.walmart.com/account/login?ref=domain");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[1]/label/div/input"))
				.sendKeys(email_address);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[2]/div/label[1]/div/input"))
				.sendKeys(password);

		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[4]/button")).click();
	}

	public void closeBrowser() {// closed browser

		if (!driver.toString().contains("null")) {
			driver.close();
		}
	}

	public static void main(String[] args) {
		SuperClass obj = new SuperClass();
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		obj.adminLogin("prajit0@yahoo.com", "cambodia1");
		obj.closeBrowser();

	}

}
