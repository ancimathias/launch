package com.abc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2
{
	@Test
	public void testcase()
	{
		System.out.println("executing test case t2()");
		
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("executing beforeclass for class2");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("executing afterclass for class2");
		
	}
}
