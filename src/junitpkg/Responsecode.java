package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
	String link="https://www.google.com";
	
	@Test
	public void test() throws IOException, Exception
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		int i=200;
		if(code==i)
		{
			System.out.println("pass");
		
		}
		else
		{
			System.out.println("failed");
		}
	


}
}
