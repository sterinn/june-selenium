package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void loadurl()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sterin/OneDrive/Documents/alertbox.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("firstname")).sendKeys("sterin");
		driver.findElement(By.name("lastname")).sendKeys("joy");
		driver.findElement(By.xpath("//input[@value=\"Display alert box\"]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
	}

}
