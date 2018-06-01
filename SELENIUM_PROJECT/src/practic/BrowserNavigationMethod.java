package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigationMethod {
//navigate().to()=load a new webpage in current broswer window
//syntax: driverObject.navigate().to("url");
	@Test
public void loginPage(){
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
String url = driver.getCurrentUrl();
System.out.println(url);
//driver.findElement(By.linkText("Gmail")).click();
driver.navigate().to("https://www.yahoo.com/");
 url = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);
//************************************************8
//nevigate().back() it move single item back in broswer history
//syntax: driverObject.navigate().back("url");
driver.get("https://www.google.com/");
String url1 = driver.getCurrentUrl();
System.out.println(url);
//driver.findElement(By.linkText("Gmail")).click();
driver.navigate().to("https://www.yahoo.com/");
 url1 = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);
driver.navigate().back();
url = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);
//driver.navigate().to("https://www.google.com/");//u can nevigate to any browser
//*********************************************************
//nevigate().forward(); it move single item forward in broswer history(
//syntax: driverObject.nevigate().forward();
driver.get("https://www.google.com/");
String url3 = driver.getCurrentUrl();
System.out.println(url);

//driver.findElement(By.linkText("Gmail")).click();
driver.navigate().to("https://www.yahoo.com/");
 url3 = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);

driver.navigate().back();
url = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);

driver.navigate().forward();
url = driver.getCurrentUrl();//can use the same variable but dont declare agian will get error
System.out.println(url);
//******************************************
//i want same output but dont use back and forward just using navigate().to();
//************************************************
//navigate().refresh();=refresh current webpage
//syntax: driver.navivigate().refresh();
//driver.get("https://www.google.com/");
String url2 = driver.getCurrentUrl();
System.out.println(url);
driver.navigate().refresh();
 url2 = driver.getCurrentUrl();
System.out.println(url);

//***************************************
//Quit() it closed all broswer that open by webdriver during execution
//driverObject.quit();









	}
}