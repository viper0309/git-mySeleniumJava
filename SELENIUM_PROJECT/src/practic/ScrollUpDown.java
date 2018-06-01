package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpDown {

	@Test
	public void scrool1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");
		JavascriptExecutor jr = (JavascriptExecutor) driver;

		jr.executeScript("window.scrollBy(0,4500)", ""); // scroll down

		Thread.sleep(3000);

		jr.executeScript("window.scrollBy(450,0)", ""); // scroll up
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_1_container']/p[4]"));
		Thread.sleep(3000);
		jr.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='mCSB_7_container']/h2"));
		jr.executeScript("arguments[0].scrollIntoView(true);", element1);
		System.out.println(element1.getText());
		driver.close();
	}
}