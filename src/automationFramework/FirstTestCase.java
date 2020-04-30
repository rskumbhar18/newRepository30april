package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver; 

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		System.out.println("Success");
		
		String title=driver.getTitle();
		System.out.println("@@@@@@@@@Page title is:"+ title);
		
		Thread.sleep(5000);
		driver.close();
	}

}
