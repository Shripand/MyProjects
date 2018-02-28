package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {

	// 
	@Test
	public void MyFirstJenkins() throws InterruptedException
	{
		System.out.println("\n\nMy jenkins....\n");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		Thread.sleep(5000);
		
	}
}
