package seleniumDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowPop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/howto/howto_js_popup.asp");
		driver.findElement(By.xpath("//a[contains(text(), 'Try it Yourself »')]")).click();
		
		Set<String>getAllWindow=driver.getWindowHandles();
		Iterator<String>getList=getAllWindow.iterator();
		
	String parentWindow=	getList.next();
System.out.println("paren window is "+parentWindow);
		
String childWindow=getList.next();
System.out.println("child window is "+childWindow);
driver.switchTo().window(childWindow);
System.out.println("title of child window is===> "+driver.getTitle());
driver.close();

driver.switchTo().window(parentWindow);
System.out.println("title of parent window is===> "+driver.getTitle());










		
	}

}
