package com.abc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 
{
	@Test
	public void testcase()
	{
		System.out.println("executing test case t1()");
		
	}
	@BeforeTest
	public void before()
	{
		System.out.println("executing before test tag in xml structure");
		
	}
	@AfterTest
	public void after()
	{
		System.out.println("executing after test tag in xml structure");
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("executing beforeclass for class1");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("executing afterclass for class1");
		
	}
}
