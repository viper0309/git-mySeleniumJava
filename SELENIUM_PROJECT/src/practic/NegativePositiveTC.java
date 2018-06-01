package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativePositiveTC {//2 verifiaction point
static int i;
static String username, password, iteration;

	@Test
	
	public void NegativeTC() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//create driver object, 2 iteration use loops
	for(i=1; i<=2; i++){
//conditon required
if (i==1) {
username="prajit0@yahoo.com";
password="cambodia1";
iteration="Iteration 1:";
}
else if(i==2){
username="praji@yahoo.com";
password="cambodia11";
	iteration="Iteration 2:";
}
	driver.get("http://www.gcrit.com/build3/login.php");
	driver.findElement(By.name("email_address")).sendKeys("username");	
	driver.findElement(By.name("password")).sendKeys("password");	
	Thread.sleep(3000);
	driver.findElement(By.id("tdb5")).click();
	//capture error
	String url = driver.getCurrentUrl();
	
	if(url.contains("http://www.gcrit.com/build3/index.php")){	
	System.out.println(iteration + ("Input Data:") + username+ " , " + password + "Admin Login Successful -Passed");
	//now login n out
	driver.findElement(By.linkText("Log Off")).click();
	Thread.sleep(2000);
	}
	else if (! url.contains("http://www.gcrit.com/build3/index.php")){
	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
	if (ErrorMessage.contains("Error: No match for E-Mail Address and/or Password.")){
	System.out.println(iteration + ("Input Data:") + username+ " , " + password + "handling invalid input -Passed");
	}
	else{
	System.out.println("iteration Failed");		
	}		
	}
	}
	}
	}
