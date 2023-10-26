package self;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GeeksforGeeks {
	@Test
	public void geeksForGeeks() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("geeks for geeks", Keys.ENTER);
		driver.findElement(By.xpath("(//span[contains(text(),'GeeksforGeeks')])[1]")).click();
		WebElement insta = driver.findElement(By.xpath("//a[@aria-level='GeeksforGeeks Instagram']"));
		Actions act=new Actions(driver);
		act.moveToElement(insta).click().perform();
		
	}

}