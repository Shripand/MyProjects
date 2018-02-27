package test;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class LoadUrl {


//public void connectURL() throws InterruptedException
//{
//		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
//		driver.get("http://www.seleniumhq.org");
//		Thread.sleep(5000);
//		driver.close();
//	}
//	
@Test
public void connectUrlGrid() throws MalformedURLException
{
	DesiredCapabilities cap = DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.ANY);
	
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);
	driver.get("http://www.seleniumhq.org");
	}   
}//LoadUrl	
	 
/*
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		}
	
}
*/