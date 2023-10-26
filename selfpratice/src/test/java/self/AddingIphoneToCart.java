package self;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingIphoneToCart {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver (1).exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]")).click();

}
}