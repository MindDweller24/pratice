package com.TMSgrid.obs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.BaseClass;

public class AmazonTest  {
	@Test
	public void aws() {
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}

}
