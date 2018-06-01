package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchURLSimulateBackFordButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		

		driver.navigate().to("http://groups.spicejet.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		
		driver.quit();
	}

}
