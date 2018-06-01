package com.FreeCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCRM.base.Testbase;

public class LoginPage extends Testbase {

	//define page factory -OR
	
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		 @FindBy(xpath="//input[@type='submit']")
		 WebElement clickButton;
		 
		 @FindBy(xpath="//img[@class='img-responsive']")
		
		 WebElement verifyLogo;
		 
		 //initailze the page object using page factory
		 public LoginPage() {
			 PageFactory.initElements(driver, this);
		}
		 //action meaning verfy the page title
		 public String validateLoginPage() {
			 return driver.getTitle();
}
		 public boolean validateImage() {
			 return verifyLogo.isDisplayed();
		 }
		 public HomePage login(String user, String pass) {
			 username.sendKeys(user);
			 password.sendKeys(pass);
			 clickButton.click();
			 
			 return  new HomePage();
			
		 }
}
	

