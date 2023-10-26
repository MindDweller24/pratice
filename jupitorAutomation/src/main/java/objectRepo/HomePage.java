package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[.='Contact']")
	private WebElement contact;
	
	@FindBy(xpath = "//a[.='Shop']")
	private WebElement shop;

	public WebElement getContact() {
		return contact;
	}
	
	public  HomePage(WebDriver cd) {
		PageFactory.initElements(cd, this);
	}
	
	
	public void homeAction() {
		contact.click();
		
	}

	public WebElement getShop() {
		return shop;
	}
	
	public void shopClick() {
		shop.click();
	}
	
}
