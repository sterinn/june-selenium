package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemothod url loading");
		
	}
	
	@Test(priority=4,invocationCount = 3)
    public void test1()
    {
		System.out.println("test1");
    }
	@Test(priority = 3,dependsOnMethods = {"test1"})
	public void test2()
	{
		System.out.println("test2");
		
	}
	@Test(priority = 1,enabled=false)
	public void test3()
	{
		System.out.println("test3");
		
	}
	@Test(priority = 2)
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("aftermethod");
		
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("aftertest");
	}
	
	
	
	
}
