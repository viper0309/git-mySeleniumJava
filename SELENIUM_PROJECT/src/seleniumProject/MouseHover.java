package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.rackspace.com/");
		driver.manage().window().maximize();
		
		WebElement objSignup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
		Actions objActions = new Actions(driver);
		objActions.moveToElement(objSignup).build().perform();
		driver.findElement(By.xpath("//a[text()='Cloud Sites']")).click();
		
	}

}
