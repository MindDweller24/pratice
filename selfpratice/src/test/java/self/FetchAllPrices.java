package self;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchAllPrices {
	@Test
	public void fetch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone&crid=H2VDPXCD69UJ&sprefix=iphon%2Caps%2C349&ref=nb_sb_noss_2");
		List<WebElement> prices = driver.findElements(By.xpath("//span[contains(text(),'iPhone')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
		for(int i=0;i<prices.size();i++) {
			String price = prices.get(i).getText();
			System.out.println(price);
		}
	}
}
