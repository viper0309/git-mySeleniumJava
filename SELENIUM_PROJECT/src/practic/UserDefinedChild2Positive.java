package practic;

import org.openqa.selenium.By;

public class UserDefinedChild2Positive extends UserDefinedMethodTC {

	public static void main(String[] args) { //(positive testcase)valid Input
		UserDefinedChild2Positive obj2 = new UserDefinedChild2Positive();
obj2.launchBrowser();
obj2.adminLogin();
driver.findElement(By.linkText("Log Off")).click();
String url = driver.getCurrentUrl();//capture url

if (url.contains("http://www.gcrit.com/build3/logoff.php")){
	System.out.println("Passed");
}
else{
	System.out.println("Failed");	
}
obj2.closeBrowser();
		
}
}
