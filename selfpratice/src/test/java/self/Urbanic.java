package self;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanic {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver (1).exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.urbanic.com/category/denim/shop-by-category/jeans-733");
//		WebElement denim = driver.findElement(By.xpath("//span[text()='DENIM']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(denim).click().perform();
//		driver.findElement(By.xpath("//a[text()='Jeans']")).click();
		driver.findElement(By.xpath("//span[text()='SHOW FILTERS']")).click();

		WebElement src = driver.findElement(By.xpath("//span[@role='slider' and @aria-valuenow=\"1990\"]"));
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(src, -136,0).perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='index-module_title__g60Zr']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	
		
}
}