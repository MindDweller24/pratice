package self;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download {
	@Test
	public void shadowing() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15" ,Keys.ENTER);
		List<WebElement> colors = driver.findElements(By.xpath("(//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start'])[12]/descendant::a[@aria-label=\"Black\"]"));
		for(Webele:colors) {
			
		}
	

}
