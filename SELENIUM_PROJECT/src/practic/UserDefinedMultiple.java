package practic;

import org.openqa.selenium.By;

public class UserDefinedMultiple extends UserDefinedMethodTC {

	public static void main(String[] args) {
		UserDefinedMultiple obj4 = new UserDefinedMultiple();
		// TC1: Rediredt to UserInterface
		obj4.launchBrowser();
		obj4.adminLogin("prajit0@yahoo.com", "cambodia1");

		driver.findElement(By.linkText("Catalog")).click();
		// then capture url
		String url = driver.getCurrentUrl();

		if (url.equals("http://www.gcrit.com/build3/index.php")) {
			System.out.println("Redirected to userInterface - passed ");
		} else {
			System.out.println("Not Redirected to userInterface - Failed ");
		}
		obj4.closeBrowser();

		System.out.println("*******************************************");

		obj4.launchBrowser();
		obj4.adminLogin();
		driver.findElement(By.linkText("Log Off")).click();
		String urllpage = driver.getCurrentUrl();// capture url

		if (urllpage.contains("http://www.gcrit.com/build3/logoff.php")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		obj4.closeBrowser();

		System.out.println("*******************************************");

		obj4.launchBrowser();
		obj4.adminLogin("prajit00@yahoo.com", "password");
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		// captur error message
		if (ErrorMessage.contains("Error: No match for E-Mail Address and/or Password")) {
			System.out.println("Handling Invalid Input- Passed");
		} else {
			System.out.println("Handling Invalid Input -Failed");
		}
		obj4.closeBrowser();
	}
}
