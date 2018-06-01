package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class InternalExternalLinkTC {
//Internal Link mean: it redirects to another page or location in same application
//External Link: its redirects to another page or location on other application
	
@Test
public void Basic(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
driver.findElement(By.linkText("Create account")).click();
//driver.navigate().back();
//driver.findElement(By.linkText("seleniumhq.org")).click();
//capture the URL
/*String url = driver.getCurrentUrl();
//first verification
//if (url.contains("wikipedia.org")){
//System.out.println("it an internal link - redircted to other page same application-Passed");
}
else{
	System.out.println("it an External link - redircted to other page in other application-failed");		
	}
//navigate back to selenium wikpedia
driver.navigate().back();
driver.findElement(By.linkText("seleniumhq.org")).click();
//capture the url
//url = driver.getCurrentUrl();
//negative condition this time
//if (!url.contains("wikipedia.org")){
System.out.println("it an External link - redircted to other page in other application-Passed");	
//}
*///else{
	//System.out.println("it an internal link - redircted to other page same application-Failed");	
//}
driver.close();
}
}

//no test data required