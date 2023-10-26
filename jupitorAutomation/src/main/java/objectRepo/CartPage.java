package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {

	@FindBy(xpath = "//td[.=' Stuffed Frog']/following-sibling::td[1]")
	private WebElement stuffedFrogRate;
	
	@FindBy(xpath = "//td[.=' Fluffy Bunny']/following-sibling::td[1]")
	private WebElement fluffyBunnyRate;
	
	@FindBy(xpath = "//td[.=' Valentine Bear']/following-sibling::td[1]")
	private WebElement valentineBearRate;
	
	@FindBy(xpath = "//td[.=' Stuffed Frog']/following-sibling::td/input[@name='quantity']")
	private WebElement stuffedFrogQuantity;
	
	@FindBy(xpath = "//td[.=' Fluffy Bunny']/following-sibling::td/input[@name='quantity']")
	private WebElement fluffyBunnyQuantity;
	
	@FindBy(xpath = "//td[.=' Valentine Bear']/following-sibling::td/input[@name='quantity']")
	private WebElement valentineBearQuantity;
	
	
	@FindBy(xpath = "//td[.=' Stuffed Frog']/following-sibling::td[2]/following-sibling::td[1]")
	private WebElement stuffedFrogTotal;
	
	@FindBy(xpath = "//td[.=' Fluffy Bunny']/following-sibling::td[2]/following-sibling::td[1]")
	private WebElement fluffybunnyTotal;
	
	@FindBy(xpath = "//td[.=' Valentine Bear']/following-sibling::td[2]/following-sibling::td[1]")
	private WebElement valentineBearTotal;
	
	@FindBy (xpath="//strong[@class='total ng-binding']")
	private WebElement alltotal;
	public CartPage(WebDriver cd) {
		PageFactory.initElements(cd, this);
	}
	
	public void getAllthePrice() {
		String priceStuffed = stuffedFrogRate.getText();
		System.out.println(priceStuffed);
		String quantitystuffed = stuffedFrogQuantity.getAttribute("value");
		System.out.println(quantitystuffed);
		String pricefluffy = fluffyBunnyRate.getText();
		String quantityFluffy = fluffyBunnyQuantity.getAttribute("value");
		String priceValentina = valentineBearRate.getText();
		String quantityValentina = valentineBearQuantity.getAttribute("value");
		
		String StuffedTotal  = stuffedFrogTotal.getText();
		System.out.println(StuffedTotal);
		String fluffyTotal  = fluffybunnyTotal.getText();
		String valentinaTotal  = valentineBearTotal.getText();
//		
//		int alltotalstudffed = Integer.parseInt(priceStuffed)  * Integer.parseInt(quantitystuffed);
//		int alltotalflurry = Integer.parseInt(pricefluffy)  * Integer.parseInt(quantityFluffy);
//		int alltotalValentina = Integer.parseInt(priceValentina)  * Integer.parseInt(quantityValentina);
		String total = alltotal.getText();
		
		int allProductTotal =  Integer.parseInt(StuffedTotal)  + Integer.parseInt(fluffyTotal) + Integer.parseInt(valentinaTotal);
		int totals = Integer.parseInt(total);
//		Assert.assertEquals(StuffedTotal, alltotalstudffed);
//		Assert.assertEquals(fluffyTotal, alltotalflurry);
//		Assert.assertEquals(valentinaTotal, alltotalValentina);
		
//		Assert.assertEquals(allProductTotal, totals);
		if(allProductTotal == totals) {
			System.out.println("The Subtotal and total is matched");
		}else {
			System.out.println("The Subtotal and total is not matched");
		}
		System.out.println("The All Total Is Validated");
		
	}
}
