package selenium;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoothTrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>getAllDropDown=driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		for(int i=0;i<getAllDropDown.size();i++) {
			WebElement nameAllRadioBoxes=getAllDropDown.get(i);
			
			String name=nameAllRadioBoxes.getAttribute("id");
			System.out.println(name);
			if(name.equalsIgnoreCase("Ruby")) {
			System.out.println("actual test is passed");
		nameAllRadioBoxes.click();
		break;
			
			}
		}
		
	}

}