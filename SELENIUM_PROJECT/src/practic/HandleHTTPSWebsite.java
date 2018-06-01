package practic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandleHTTPSWebsite {

	//Syntax-public class HTTPSSecuredConnection { 
	
		public static void main(String[] args){  
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
			//WebDriver driver =new FirefoxDriver();	
			FirefoxProfile profile = new FirefoxProfile(); 
			profile.setAcceptUntrustedCertificates(false); 
			WebDriver driver = new FirefoxDriver(profile);  
			driver.get("https://www.yahoo.com/");   
	}

	}


