package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test()
	{
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		act.contextClick(ele1).perform();
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	@Test
	public void test2()
	{
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.doubleClick(ele2).perform();		
		
		
	}
	
	

}
