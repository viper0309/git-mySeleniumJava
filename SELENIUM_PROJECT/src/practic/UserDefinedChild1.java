package practic;

import org.openqa.selenium.By;

public class UserDefinedChild1 extends UserDefinedMethodTC {

	public static void main(String[] args) {
	UserDefinedChild1 obj1 = new UserDefinedChild1();
	obj1.launchBrowser();
	obj1.adminLogin("prajit0@yahoo.com", "cambodia1");
	driver.findElement(By.linkText("Catalog")).click();
//then capture url
	String url = driver.getCurrentUrl();
	
	if (url.equals("http://www.gcrit.com/build3/index.php")){
		System.out.println("Redirected to userInterface - passed ");		
	}
	else{
		System.out.println("Not Redirected to userInterface - Failed ");
	}
	obj1.closeBrowser();
	}

}
