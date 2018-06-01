package com.FreeCRM.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FreeCRM.base.Testbase;

public class HomePage extends Testbase{
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactLink;

}
