package seleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {

		//getscreenshotAs method is there will give us 1 file object but we top casting into take takescreenshot class.
		//we convert driver to takescreenshot interface. from file object we can use COPYFILE fron src to which location you want to store
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com");
		//take screenshot ans store at the file formate
		File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshot to disire location using COPYFILE METHID
		
		FileUtils.copyFile(fi, new File("C:/Users/shreya/Desktop/MyNewProject/SELENIUM_PROJECT/src/seleniumDemo/bankofamerica.png"));
	}

}
