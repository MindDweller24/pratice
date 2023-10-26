package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String BaseUrl="https://demo.guru99.com/v3/index.php";
	public String UserName="mngr530267";
	public String PassWord="EdypUju";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver (1).exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
