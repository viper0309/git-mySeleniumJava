package practic;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Child1 extends SuperClass {

	public static void main(String[] args) {
		Child1 obj4 = new Child1();

		// TC1: Rediredt to UserInterface

		obj4.launchBrowser();
		obj4.adminLogin("prajit0@yahoo.com", "cambodia1");

		driver.findElement(By.linkText(" My local store ")).click();
		// then capture url
		String url = driver.getCurrentUrl();

		if (url.equals("https://www.walmart.com/store/3520/whats-new")) {
			System.out.println("Redirected to userInterface - passed ");
		} else {
			System.out.println("Not Redirected to userInterface - Failed ");
		}
		obj4.closeBrowser();

		System.out.println("*******************************************");

		// TC2
		obj4.launchBrowser();
		obj4.adminLogin();
		Actions mouseHover = new Actions(driver);

		WebElement myAcct = driver.findElement(By.linkText("My Account"));
		mouseHover.moveToElement(myAcct).build().perform();
		driver.findElement(By.linkText("Sign Out")).click();

		String urllpage = driver.getCurrentUrl();// capture url

		if (urllpage.contains("https://www.walmart.com/account/login?ref=domain")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");//
		}
		obj4.closeBrowser();

		System.out.println("*******************************************");

		// TC3
		obj4.launchBrowser();
		obj4.adminLogin("prajit00@yahoo.com", "password");
		String ErrorMessage = driver
				.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[1]/label/p")).getText();
		// captur error message
		if (ErrorMessage.contains("This information is required.")) {
			System.out.println("Handling Invalid Input- Passed");
		} else {
			System.out.println("Handling Invalid Input -Failed");
		}
		obj4.closeBrowser();
	}
}
