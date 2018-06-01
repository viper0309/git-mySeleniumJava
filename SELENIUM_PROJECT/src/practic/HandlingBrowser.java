package practic;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingBrowser {//operation on browser
	
@Test

public void TestBrowser(){
	
}
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\SeleniumDownload\\geckodriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
String pagetittle = driver.getTitle();
System.out.println(pagetittle);

String url = driver.getCurrentUrl();
System.out.println(url);
	
String WindowHandle = driver.getWindowHandle();
System.out.println(WindowHandle);
driver.close();
//driver.quit();	
	
	
	
}}