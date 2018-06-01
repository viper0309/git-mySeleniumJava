package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsEnableMethod {// it check weather the element is enable state or not it written boolean result
//syntax: boolean variableName=driver.fidelement(by.name("value").isEnable();
	
@Test
public void loginPage(){	
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
boolean a = driver.findElement(By.id("next")).isEnabled();
System.out.println(a);
}
}