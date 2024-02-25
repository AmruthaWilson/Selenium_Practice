package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//WebDriverManager.chromedriver().setup(); //to setup browser driver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.quit();
		

	}
}


