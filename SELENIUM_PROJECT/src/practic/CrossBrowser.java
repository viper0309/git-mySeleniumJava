package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Test
public void CrossBrowserDemo(){
//System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.ie.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\IEDriverServer.exe");
WebDriver driver = new InternetExplorerDriver();
driver.get("https://www.google.com/");
//System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
//WebDriver driver =new FirefoxDriver();	
//driver.get("https://www.google.com/");












	}

}
