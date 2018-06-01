package practic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver {
	//  Open a browser in memory means whenever it will try to open a browser the browser page must not come and can perform the operation internally. 
	//Ans- use HtmlUnitDriver. 
	//ex
		public static void main(String[] args) { 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
		HtmlUnitDriver driver1 = new HtmlUnitDriver(true); 
		driver1.setJavascriptEnabled(false);  
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	
	driver.get("https://www.yahoo.com/");  
	System.out.println(driver.getCurrentUrl()); 
	}

}
