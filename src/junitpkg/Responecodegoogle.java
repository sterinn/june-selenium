package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responecodegoogle {
	ChromeDriver dr;
	@Before
	public void setup()
	{
		dr=new ChromeDriver();
		dr.get("https://www.google.com");
		
	}
	@Test
	public void totallinks()
	{
		List<WebElement> li=dr.findElements(By.tagName("a"));
		System.out.println("no of links ="+li.size()); 
		System.out.println("no of links ="+li);
		for(WebElement ele: li)
		{
			String link = ele.getAttribute("href");
			String text=ele.getText();
			verifylink(link);
			
			
		}
		
	}
	private void verifylink(String link)
	{
		try
		{
			URI Ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection)Ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("successfull response code is 200"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken code"+link);
			}
		}
	
				
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
			
					
		}
	}



