package practic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test5 {//C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe
	
@Test
//public static void main(String[] args) {
public void loginPage(){
//change my desktop	path 
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");

//WebDriver driver =new FirefoxDriver();

driver.get("https://www.google.com");
String Tittle = driver.getTitle();
Assert.assertEquals(Tittle, "facebook");//keep it the las line if you want to perform
driver.close();
}
}