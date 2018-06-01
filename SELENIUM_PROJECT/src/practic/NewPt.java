package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement link;
		link = driver.findElement(By.className("link-box"));
		link.click();

		// driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		WebElement searchBox;
		searchBox = driver.findElement(By.xpath(".//*[@id='searchInput']"));
		searchBox.sendKeys("Cambodia");
		Thread.sleep(5000);
		searchBox.submit();
		driver.quit();
	}

}
