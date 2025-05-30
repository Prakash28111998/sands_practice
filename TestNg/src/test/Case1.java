package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Case1 {
	@Parameters({"URL"})
	@Test
	public void test1 (String link)
	{
		System.out.println("Welcome TestNG");
		System.out.println(link);
	}
	@BeforeTest
	public void name() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void aftername() {
		// TODO Auto-generated method stub
		System.out.println("After Test");
	}
	

}
