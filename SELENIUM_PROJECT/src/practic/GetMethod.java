package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GetMethod {
	@Test
	//public static void main(String[] args) {
	public void loginPage(){
	//change my desktop	path 
	//get URL	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shreya\\Desktop\\MySeleniumSetup\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//driver.get("https://www.bankofamerica.com/");
//***************************************
//getTittle()=return the tittle of the broswer
//syntax: string variable=driver.getTittle();
//driver.get("https://www.bankofamerica.com/");
//String tittle = driver.getTitle();
//*************************************
//get source rigth click on the webpage
/*driver.get("https://www.bankofamerica.com/");
String pagesource = driver.getPageSource();
System.out.println(pagesource);*/
//**********************************************
//getcurrent url() get currt url of the broswer
	driver.get("https://www.bankofamerica.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
//**************************************************
	//




}
}