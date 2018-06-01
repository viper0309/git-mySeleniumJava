package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableDeomo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");
		
		
		boolean displayElement=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(displayElement);
		

		boolean displayElement1=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(displayElement1);
	}

}
