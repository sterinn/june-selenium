package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeTest
	public void openurl()
	{
		driver= new ChromeDriver();
		driver.get("https://www.trivago.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]")).click();
		datepicker ("November 2024","1");
		
		
	}
	public void datepicker(String expmonth, String expdate) {
		while(true)
		{
		WebElement monthdetails=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		String month=monthdetails.getText();
		if(expmonth.equals(month))
		{
			System.out.println(month);
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		}
		}
	
	List<WebElement> datelist =driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button"));
	for(WebElement ele:datelist)
	{
		String date=ele.getText();
		if(date.equals(expdate))
		{
			ele.click();
			break;
		}
	}
	
}}




