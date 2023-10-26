package com.inetbanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='uid']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//input[@name='btnReset']")
	private WebElement resetBtn;

	//initiallize the webelements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilizing the Webelement

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}
	
	//business logic
	public void enterUserName(String UserName) {
		username.sendKeys(UserName);
	}
	
	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}
	
	public void loginButton() {
		loginBtn.click();
	}
	public void resetButton() {
		resetBtn.click();
	}
	
	

}
