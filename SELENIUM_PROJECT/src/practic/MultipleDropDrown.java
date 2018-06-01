package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleDropDrown {
	@Test
public void Demo(){
System.setProperty("webdriver.gecko.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();
driver.get("https://account.sonyentertainmentnetwork.com/liquid/reg/account/create-account!input.action");
WebElement month = driver.findElement(By.id("monthDropDown"));
Select monthD = new Select(month);
monthD.selectByIndex(6);	//select item by index
//dropDown.selectByVisibleText

//WebElement Selected_value= monthD.getFirstSelectedOption();
//driver.findElement(By.xpath(".//*[@id='regInput_MaleGender']")).click();

	}
}
