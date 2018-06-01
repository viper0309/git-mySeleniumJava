package seleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UseConfigDotPropertiesFile {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException {

		
		Properties prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\shreya\\Desktop\\MyNewProject\\SELENIUM_PROJECT\\src\\seleniumDemo\\config.properties");
		
		prop.load(fi);
		
		String urlID=prop.getProperty("url");
		
		String browserNmae=prop.getProperty("browserType");
		
		if(browserNmae.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if(browserNmae.equalsIgnoreCase("IEDriver")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();

		}
		driver.get(urlID);
		
		
		
		
		
		
		
	}

}
