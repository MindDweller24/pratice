package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactPage {

	public ContactPage(WebDriver cd) {
		PageFactory.initElements(cd, this);
	}
	
	@FindBy(id = "forename-err")
	private WebElement foreName;
	
	@FindBy(id = "email-err")
	private WebElement email;
	
	@FindBy(id = "message-err")
	private WebElement message;
	
	@FindBy(xpath = "//input[@name = 'forename']")
	private WebElement foreNameTxt;
	
	@FindBy(xpath = "//input[@name = 'surname']")
	private WebElement surnameTxt;
	
	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement emailTxt;
	
	@FindBy(xpath = "//input[@name = 'telephone']")
	private WebElement telephoneTxt;
	
	@FindBy(xpath = "//textarea[@name = 'message']")
	private WebElement messageTxt;
	
	@FindBy(xpath="//a[.='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement AlertSuccess;
	
	

	public WebElement getForeName() {
		return foreName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getForeNameTxt() {
		return foreNameTxt;
	}

	public WebElement getSurnameTxt() {
		return surnameTxt;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getTelephoneTxt() {
		return telephoneTxt;
	}

	public WebElement getMessageTxt() {
		return messageTxt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getAlertSuccess() {
		return AlertSuccess;
	}
	
	public void submitAction() {
		submitBtn.click();
	
	}
	
	public void AssertValidation(WebDriver cd, String fname,String email1, String mesg) {
//		
		String forNameErr=foreName.getText();
		String emailErr=email.getText(); 
		String mesgErr = message.getText();
		Assert.assertEquals(fname, forNameErr);
		Assert.assertEquals(email1, emailErr);
		Assert.assertEquals(mesg, mesgErr);
	}
	public void ContactAction(String fname,String sname, String email1, String telephone, String msg, String success,WebDriver cd) throws InterruptedException {
		foreNameTxt.sendKeys(fname);
		surnameTxt.sendKeys(sname);
		emailTxt.sendKeys(email1);
		telephoneTxt.sendKeys(telephone);
		messageTxt.sendKeys(msg);
		submitAction();
		Thread.sleep(3000);
		String successMsg = AlertSuccess.getText();
		Assert.assertEquals(success, successMsg);
		System.out.println("done");
	}
}
