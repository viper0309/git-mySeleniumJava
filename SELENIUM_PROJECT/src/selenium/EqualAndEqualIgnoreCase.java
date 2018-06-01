package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualAndEqualIgnoreCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\r\n" + 
				"";
		String actul="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\r\n" + 
				"";
		
	boolean resul=expected.equalsIgnoreCase(actul);
	System.out.println(resul);
	}

}
