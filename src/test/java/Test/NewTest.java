package Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("Class A: Test Method 1");
	}
	
	@Test
	public void f1(){
		System.out.println("Class A: Test Method 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Class A: Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Class A: After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Class A: Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Class A: After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Class A: Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Class A: After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Class A: Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Class A: After Suite");
	}

}
