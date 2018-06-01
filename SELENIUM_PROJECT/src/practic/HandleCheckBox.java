package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleCheckBox {
//select,unselect,check display status,check enable status,check select status
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.mycontactform.com/samples.php");
System.out.println(driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).isDisplayed());
System.out.println(driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).isEnabled());
System.out.println(driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).isSelected());
driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).isSelected());
driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='contactForm']/table/tbody/tr[9]/td/div[1]/input[3]")).isSelected());

		
	
	
	
	
	}	
}
