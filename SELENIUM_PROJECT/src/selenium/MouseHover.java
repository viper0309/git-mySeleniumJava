package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions move=new Actions(driver);
		move.moveToElement(driver.findElement(By.linkText("Departments"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(), 'Fire TV')]")).click();
  Actions move1=new Actions(driver);
		move1.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'See Fire TV Family')]"))).build().perform();
		
	}

}