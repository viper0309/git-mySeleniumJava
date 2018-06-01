package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
public static WebDriver driver;
public static int browser;
public static String BrowserName;

public static void main(String[] args) {
for (browser = 1; browser <= 3; browser++){
if (browser==1){
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
 driver =new FirefoxDriver();
BrowserName = "Mozilla Firefox";
driver.get("https://www.google.com/");
break;
}
else if (browser == 2){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
 driver = new ChromeDriver();	
BrowserName = "Chrome Browser";
driver.get("https://www.google.com/");
break;
}
else if (browser ==3){
System.setProperty("webdriver.ie.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\IEDriverServer.exe");
driver = new InternetExplorerDriver();
BrowserName = "Internet Explorer";
driver.get("https://www.google.com/");
break;
}


}
}
}


