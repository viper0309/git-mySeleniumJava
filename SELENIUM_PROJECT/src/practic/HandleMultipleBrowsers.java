package practic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleBrowsers {
	@Test
	public void BasicMain() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		//i want to get window handle parent window
		String superClass = driver.getWindowHandle();
		
		//System.out.println(parent);

		Set <String>  Handles = driver.getWindowHandles();	
		int BrowserCount = Handles.size();
		System.out.println(BrowserCount);//how many broswer open
		//driver.quit();

		//i want to switch to second broswer	
		for (String child:Handles){	//enhance for loop

			if(! child.equals(superClass)){
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
			}
		}
		//i want to get window handle parent window	
		Thread.sleep(4000);
		driver.switchTo().window(superClass);
		System.out.println(driver.getCurrentUrl());
	}

}	

