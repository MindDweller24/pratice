package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.LoginPage;

public class TC_logintest_001 extends BaseClass {
	@Test
	public void login() {
		driver.manage().window().maximize();
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(UserName);
		lp.enterPassword(PassWord);
		lp.loginButton();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}


		
	}

}
