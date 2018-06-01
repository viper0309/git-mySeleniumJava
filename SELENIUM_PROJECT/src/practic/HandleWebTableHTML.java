package practic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTableHTML {
//get cell value,row count,cell count
	@Test
public void BasicMain(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.mycontactform.com/how.php");
//cell value
String s = driver.findElement(By.xpath(".//*[@id='center_col']/table/tbody/tr[3]/td[3]")).getText();
System.out.println(s);
//cfeate single webElement
WebElement htmlTable = driver.findElement(By.id("center_col"));
//create list value web element
List<WebElement> row = htmlTable.findElements(By.tagName("tr"));
//if u want to rows'tr' for cell'td
//row count 
int r = row.size();
System.out.println(r);
List<WebElement> cell =htmlTable.findElements(By.tagName("td"));
int c = cell.size();
System.out.println(c);
	}
}