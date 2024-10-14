package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver(); //open browser
    driver.get("https://www.google.com");//url loading
    driver.close();
    }

}
