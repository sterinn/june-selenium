package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void loadurl()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		WebElement dayelementElement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day)]"));
		Select day=new Select(dayDropdown);
		day.selectByValue("22");
		
		WebElement monthelementElement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month=new Select(monthelementElement);
		month.selectByValue("NOV");
		
		WebElement yearelementElement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select year=new Select(yearelementElement);
		
		
		
		
	}
	
	
	
}
