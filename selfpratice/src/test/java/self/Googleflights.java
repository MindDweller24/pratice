package self;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Googleflights {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver (1).exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/travel/flights");
		
		driver.findElement(By.xpath("(//input[@class='II2One j0Ppje zmMKJ LbIaRd'])[3]")).sendKeys("new delhi");
		driver.findElement(By.xpath("(//div[text()='New Delhi' ])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='BLohnc q5Vmde'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='October']/../descendant::div[@class='eoY5cb CylAxb sLG56c yCya5' and text()='1']")).click();
		driver.findElement(By.xpath("//div[text()='October']/../descendant::div[@class='eoY5cb CylAxb sLG56c yCya5' and text()='7']")).click();
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']/following-sibling::span[text()='Done']")).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-kBDsod E6fbI']")).click();
		
	List<WebElement> prices = driver.findElements(By.xpath("//h3[text()='Best departing flights']/../descendant::div[@class='BVAVmf I11szd POX3ye']/descendant::span"));
	String secMax = prices.get(prices.size()-2).getText();
	System.out.println(secMax);
//		LinkedHashSet<Object> al=new LinkedHashSet<>();
//		for (int i = 0; i < prices.size(); i++) {
//			String flightPrice = prices.get(2).getText();
//			System.out.print(flightPrice);
//			break;
//	}
		
		

}
}
