package test;

import javax.swing.GroupLayout.Group;

import org.testng.annotations.Test;

public class Case2 {
	@Test
	public void test1 ()
	{
		System.out.println("Welcome JAVA");
	}
	
	@Test(groups={"smoke"})
	public void test2 ()
	{
		System.out.println("Welcome PYTHON");
	}
	@Test
	public void test3 ()
	{
		System.out.println("Welcome");
	}

}
