package testfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ActiTime {
	@Test
	public void findEmployee() throws InterruptedException {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ch);
		//WebDriverUtility wlib=new WebDriverUtility();
		//wlib.maximize(driver);
		driver.get("https://www.spicejet.com/");
		//wlib.waitCondition(driver);
		
		//driver.findElement(By.xpath("//div[text()='From']")).sendKeys("bengaluru");
		Thread.sleep(3000);
	WebElement ele=	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"));
	ele.click();

	ele.sendKeys("Hyderabad");
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")).click();
	String goDate = "//div[text()='October ' ]/parent::div/following-sibling::div/descendant::div[text()='5']";
	driver.findElement(By.xpath(goDate)).click();
//	String returnDate="//div[text()='November ']/../following-sibling::div[@class='css-1dbjc4n']/descendant::div[text()='8']";
//	driver.findElement(By.xpath(returnDate)).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	String result = driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-homxoj r-1hfyk0a\"]")).getText();
	System.out.println(result);
	Assert.assertTrue(result.contains("One Way"));
	Assert.assertTrue(result.contains("Bengaluru to Hyderabad"));
	Assert.assertTrue(result.contains(" Thu, 05 Oct 2023"));
	Assert.assertTrue(result.contains(" 1 Adult"));
	
		
	}
}
