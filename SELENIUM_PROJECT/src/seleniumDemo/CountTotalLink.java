package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTotalLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		List<WebElement>listAllElement=driver.findElements(By.tagName("a"));
	
		System.out.println(listAllElement.size());
		
int total=listAllElement.size();
		
		for(int i=1;i<total;i++) {
			
		String linkName=listAllElement.get(i).getText();
		System.out.println(linkName);
		
			
		}
		
			
			
		}
}
		
	


