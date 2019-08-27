package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	public void CreatingDBConn() {
		System.out.println("Executing DB");

	}

	@AfterTest
	public void ClosingDBConn() {
		System.out.println("closing DB");
	}

	@BeforeMethod
	public void LaunchBrowser() {
		System.out.println("Executing browser");

	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("closing browser");

	}

	@Test(priority = 2)
	public void Login() {
		System.out.println("Executing login test");

	}

	@Test(priority = 1)
	public void Reg() {
		System.out.println("Executing resister test");

	}

}
