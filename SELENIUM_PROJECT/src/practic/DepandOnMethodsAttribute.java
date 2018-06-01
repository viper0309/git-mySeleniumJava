package practic;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DepandOnMethodsAttribute {//
	@Test 	
	public void login(){
	System.out.println("Login-Passed");
	}
	@Test (dependsOnMethods = {"login"})	
	public void search(){
		System.out.println("Search-Passed");
	}
	@Test (dependsOnMethods = {"search"})		
	public void advanceSearch(){
		Assert.assertEquals("ABCD", "xyz");
	}
	@Test (dependsOnMethods = {"advanceSearch"}, alwaysRun=true)		
	public void logoff(){
		System.out.println("LogOff-Passed");
}//hard dependency>>@TEst(dependsOnMethods={"methodsName"}); it failed it wont execute remaining testcases 
}//soft dependency>>@TEst(dependsOnMethods={"methodsName"}, alwaysRun=true);