package practic;

public class TestNgTC {
	@Test(priority = 3, enabled = false) // if want to skip i dont want to
											// execute
	public void testA() {
		Assert.assertEquals("Gmail", "Gmail");
	}

	@Test(priority = 2) // attribute
	public void testc() {
		Assert.assertEquals("Google", "Google");
	}

	@Test (priority = 1)	
	public void testB(){
	Assert.assertEquals("Yahoo", "Yahoo");
	
	//*************************************************
	@Test
	public void login() {
		System.out.println("Login-Passed");
	}

	@Test(dependsOnMethods = { "login" })
	public void search() {
		System.out.println("Search-Passed");
	}

	@Test(dependsOnMethods = { "search" })
	public void logoff() {
		System.out.println("LogOff-Passed");

	}
}