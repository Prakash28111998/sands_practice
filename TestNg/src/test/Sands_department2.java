package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Sands_department2 {
	
	@Test(dependsOnMethods = {"ppc","collection"})
	public void Hr() {
	System.out.println("Hireing team");

	}
	@Parameters({ "URL" })
	@Test
	public void collection(String userlink) {
		System.out.println("money collection");
		System.out.println(userlink);

	}
	
	@Test
	public void ppc() {
		System.out.println("producation planing control");
	}
	@Test
	public void qc() {
		System.out.println("quality control");
	}
	
	@Test(dependsOnMethods = {"Hr"})
	public void accounts() {
		System.out.println("accounts team");

	}
	@Test
	public void dac() {
		System.out.println("data analiys");

	}
}
