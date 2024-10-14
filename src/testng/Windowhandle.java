package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver= new ChromeDriver();
		
		}
	@Test
	public void test() {
		driver.get("https://demo.guru99.com/popup.php");
		String parentWindow =driver.getWindowHandle();
		System.out.println("Parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath())
	
	}
	
	

}
