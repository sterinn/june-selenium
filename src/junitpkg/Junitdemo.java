package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void loadurl()
	{
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		System.out.println("actualtitle");
		if(actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("title is google");
			
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	@Test
	public void Textverification()
	{
		String s=driver.getPageSource();
		if(s.contains("Gmail"))
		{
			System.out.println("Gmail is present");
			
		}
		else
		{
			System.out.println("not present");
		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}
