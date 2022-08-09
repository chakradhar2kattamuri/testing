package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Basictest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void f() {
		System.out.println("my test cases");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("method execution");
	}



	@AfterClass
	public void afterClass() {
		System.out.println("class execution");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("test execution");
	}



	@AfterSuite
	public void afterSuite() {
	}

}
