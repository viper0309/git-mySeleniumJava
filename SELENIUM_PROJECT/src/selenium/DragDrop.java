package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions act=new Actions(driver);
		
		act.clickAndHold(driver.findElement(By.xpath("//p[contains(text(), 'Drag me to my target')]")))
		.moveToElement(driver.findElement(By.xpath("//p[contains(text(), 'Drop here')]"))).release().build().perform();
	}

}
