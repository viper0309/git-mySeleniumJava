package practic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInCaptcha {//Dynamic input
	@Test
public  void Captcha(){	
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/");	
driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
driver.findElement(By.name("j_password")).sendKeys("gld938");
//now captcha dynamic submition of test data, use scaner object for input device
Scanner scan = new Scanner(System.in);//system.in is an input stream
//now reading string type data but display message required
System.out.println("Enter Captcha");
//read
String captcha = scan.nextLine();
//write selenium wedriver statement
driver.findElement(By.name("j_captcha")).sendKeys(captcha);//dont use "" for variable
driver.findElement(By.id("loginbutton")).click();
//varification poitn
String url = driver.getCurrentUrl();

if (url.equals("https://www.irctc.co.in/eticketing/home")){
System.out.println("Login Passed");
}
else{
	System.out.println("Login Failed");	
}
driver.close();
}
}