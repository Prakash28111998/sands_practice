package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sands_department {
	
	
	@BeforeMethod
	public void stores() {
		System.out.println("material stored");

	}
	@AfterMethod
	public void producation() {
		System.out.println("Assabling");
		

	}
	@BeforeClass
	public void RandD() {
		System.out.println("Research and devlapment");

	}
	@AfterClass
	public void crm() {
		System.out.println("customer relationship managment");
		

	}
	@Test(groups = {"smoke"})
	public void calibration_Lab() {
		System.out.println("calibation the unit");

	}
	
	
	
	
	
	
	
	
	
	
}
