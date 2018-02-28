package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {

	// 
	@Test
	public void MyFirstJenkins()
	{
		System.out.println("\n\nMy jenkins....\n");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
	}
}
