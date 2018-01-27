package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	
	public void sum()
	{
		System.out.println("sum");
		
		int a =20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	
@Test
	
	public void sub()
	{
		System.out.println("subtraction");
		
		int a =20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}

@Test
 public void startDriver()
 {

//	  System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver-v0.19.1-win64/geckodriver.exe");
//	  System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver_win32/chromedriver.exe");
	    
	  WebDriver driver = new FirefoxDriver();
	//  WebDriver driver = new ChromeDriver();
      driver.get("https://www.kotak.com/");
 }

}
