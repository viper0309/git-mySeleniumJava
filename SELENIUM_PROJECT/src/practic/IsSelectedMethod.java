package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsSelectedMethod {//use on checkbox
@Test
public void loginPage(){	
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
boolean a= driver.findElement(By.xpath("next")).isSelected();
System.out.println(a);
a= driver.findElement(By.xpath("next")).isSelected();
System.out.println(a);
}

}