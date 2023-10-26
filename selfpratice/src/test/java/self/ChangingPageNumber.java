package self;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ChangingPageNumber {
	String pageNum="2";
	@Test
	public void flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Phones", Keys.ENTER);
		WebElement page = driver.findElement(By.xpath("//a[text()='"+pageNum+"']"));
		Actions act=new Actions(driver);
		act.moveToElement(page).click().perform();
		
		
	}

}
