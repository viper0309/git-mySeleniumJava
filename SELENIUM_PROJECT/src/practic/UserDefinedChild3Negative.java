package practic;

import org.openqa.selenium.By;

public class UserDefinedChild3Negative extends UserDefinedMethodTC{

	public static void main(String[] args) {//negative Input
UserDefinedChild3Negative obj3 = new UserDefinedChild3Negative();
obj3.launchBrowser();
obj3.adminLogin("prajit00@yahoo.com", "password");
String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
//captur error message
if (ErrorMessage.contains("Error: No match for E-Mail Address and/or Password")){
	System.out.println("Handling Invalid Input- Passed");
}
else{
	System.out.println("Handling Invalid Input -Failed");
}
obj3.closeBrowser();
	}

}
