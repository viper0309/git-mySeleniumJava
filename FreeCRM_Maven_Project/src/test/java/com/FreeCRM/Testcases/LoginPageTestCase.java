package com.FreeCRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCRM.Pages.HomePage;
import com.FreeCRM.Pages.LoginPage;
import com.FreeCRM.base.Testbase;

public class LoginPageTestCase extends Testbase{
	LoginPage logpage;
	HomePage homepage;
	public LoginPageTestCase() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		LoginPage logpage=new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String pageValidate=logpage.validateLoginPage();
		Assert.assertEquals(pageValidate, "Free CRM software in the cloud powers sales and customer service");
		
	}
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean image=logpage.validateImage();
		Assert.assertTrue(image);
	}
	@Test(priority=3)
	public void loginPageTest() {
		homepage=logpage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}

