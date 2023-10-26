package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

	@FindBy(xpath = "//h4[.='Stuffed Frog']/../descendant::a")
	private WebElement stuffeDogBuy;
	
	@FindBy(xpath = "//h4[.='Fluffy Bunny']/../descendant::a")
	private WebElement fluffyBunnyBuy;
	
	@FindBy(xpath = "//h4[.='Valentine Bear']/../descendant::a")
	private WebElement valentineBearBuy;
	
	@FindBy(xpath = "//*[@id=\"nav-cart\"]/a")
	private WebElement cartBtn;

	public ShopPage(WebDriver cd) {
		PageFactory.initElements(cd, this);
	}

	public WebElement getStuffeDogBuy() {
		return stuffeDogBuy;
	}

	public WebElement getFluffyBunnyBuy() {
		return fluffyBunnyBuy;
	}

	public WebElement getValentineBearBuy() {
		return valentineBearBuy;
	}
	
	public void stuffedDogBuyBtn() {
		stuffeDogBuy.click();
		stuffeDogBuy.click();
		stuffeDogBuy.click();
	}
	
	public void fluffyBunnyBuyBtn() {
		fluffyBunnyBuy.click();
		fluffyBunnyBuy.click();
		fluffyBunnyBuy.click();
		fluffyBunnyBuy.click();
		fluffyBunnyBuy.click();
	}
	
	public void valentineBearBuyBtn() {
		valentineBearBuy.click();
		valentineBearBuy.click();
		valentineBearBuy.click();
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}
	
	public void cartBtn() {
		cartBtn.click();
	}

		
}
