package practic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDownBox {
//select an item,check display status,check enable status,item count,
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.gcrit.com/build3/create_account.php");
Select dropDown = new Select (driver.findElement(By.name("country")));
//index start from 0 to -1
//dropDown.selectByIndex(6);	//select item by index
dropDown.selectByVisibleText("Cambodia");	
	
	
	}
}
