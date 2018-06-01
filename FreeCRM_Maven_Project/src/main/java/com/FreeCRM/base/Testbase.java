package com.FreeCRM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.FreeCRM.Util.TestUtil;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
try {
	prop=new Properties();
	
		FileInputStream ip=new FileInputStream("C:/Users/shreya/Desktop/MyNewProject/FreeCRM_Maven_Project/src/main/java/com"+"/FreeCRM/Config/Config.properties");
	prop.load(ip);

} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
}
	}
	public static void initialization() {
		
	String getBrowser=	prop.getProperty("browserType");
	
	if(getBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	}else if(getBrowser.equalsIgnoreCase("IEBrowser")){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMFLICIT_WAIT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
}
