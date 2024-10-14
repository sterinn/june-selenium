package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	By fbemail= By.id("email");
	By fbpass= By.id("pass");
	By fbloginbutton=By.name("login");
	
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String email,String paasword)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpass).sendKeys(paasword);
	}
	public void click()
	{
		driver.findElement(fbloginbutton).click();
	}

}
