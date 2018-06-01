package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleRadioButton {
//select,check enable status, check displayed status,check selected status
	@Test
public void BasicMain(){		
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.gcrit.com/build3/create_account.php");
WebElement male = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));
boolean elementStatus = male.isDisplayed();
System.out.println(male.isEnabled());
System.out.println(male.isSelected());
male.click();
System.out.println(male.isSelected());
}
}