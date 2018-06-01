package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya\\Desktop\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
				
		driver.get("https://www.indeed.com/resumes?isid=find-resumes&ikw=jobsearch&co=US&hl=en");
				driver.findElement(By.xpath("//input[@id='query_instant']")).sendKeys("QA");

		driver.findElement(By.id("location_instant")).sendKeys("Philadelphia, PA");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'No, thanks')]")).click();
		String getUrl=driver.getCurrentUrl();
		System.out.println(getUrl
				);
		
		
		
	}

}
