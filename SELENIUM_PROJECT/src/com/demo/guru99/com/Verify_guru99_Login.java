package com.demo.guru99.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_guru99_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.get(" http://www.demo.guru99.com/V4/");
driver.findElement(By.name("uid")).sendKeys("mngr130938");
driver.findElement(By.name("password")).sendKeys("EhYpEne");
driver.findElement(By.name("btnLogin")).click();

String currentURL=driver.getCurrentUrl();
System.out.println(currentURL);
String expectedURL="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
String actualURL="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
if(expectedURL==actualURL) {
	System.out.println("This test Passed");
	
}else{
System.out.println("This test Failed");
	
}

	
	}

}
