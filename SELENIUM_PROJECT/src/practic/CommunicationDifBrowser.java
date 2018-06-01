package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CommunicationDifBrowser {//capture value from one browser to other
@Test
public void Demo(){
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
WebDriver firefoxDriver = new FirefoxDriver();
firefoxDriver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
//capture the value string required
String text = firefoxDriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h2")).getText();

System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver chromeDriver = new ChromeDriver();
chromeDriver.get("https://login.yahoo.com/;_ylt=A0LEV78JuFhY0lIAcgsnnIlQ;_ylu=X3oDMTE0cmJsMmxtBGNvbG8DYmYxBHBvcwMxBHZ0aWQDRkZVSTNDMl8xBHNlYwNzcg--");
//now enter value to this chrome
chromeDriver.findElement(By.id("login-username")).sendKeys(text);
}
}