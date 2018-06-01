package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleUploadFileAndScrollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		JavascriptExecutor scrollDown=(JavascriptExecutor)driver;
scrollDown.executeScript("window.scrollBy(0,4500)", "");


driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\shreya\\Desktop\\Main_QA_Resume\\SHREYA_MADAN_Resume.doc");
	}

}
