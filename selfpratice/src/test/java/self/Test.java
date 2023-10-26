package self;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class Test{
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
	}
	@org.testng.annotations.Test
	public void hello() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.letskodeit.com/practice");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2000)", "");
//		driver.findElement(By.id("mousehover")).click();
//		WebElement mousehvr = driver.findElement(By.xpath("//a[text()='Reload']"));
////		Thread.sleep(2000);
////		driver.findElement(By.id("hondaradio")).click();
////		Select s=new Select(drpdwn);
////		s.selectByVisibleText("Honda");
//		Actions act=new Actions(driver);
//		act.moveToElement(mousehvr).click().perform();
//		ChromeOptions cr=new ChromeOptions();
//		cr.addArguments("--disable-notifications");
//		driver.get("https://www.ixigo.com/");
//		driver.findElement(By.xpath("//div[text()='From']/following-sibling::input[contains(@placeholder,'city')]")).sendKeys("bangalore", Keys.ENTER);
//		Thread.sleep(2000);
//		WebElement to = driver.findElement(By.xpath("//div[text()='To']/following-sibling::input[contains(@placeholder,'city')]"));
//		to.sendKeys("mumbai");
		//WebElement date = driver.findElement(By.xpath("//div[text()='Departure']/following-sibling::input[contains(@placeholder,'Dep')]"));
		//date.click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(date));
//		Thread.sleep(3000);
//		to.sendKeys(Keys.ENTER);
//		
//		WebElement goDate = driver.findElement(By.xpath("//div[text()='October 2023']/..//tbody/descendant::td[@data-date='30102023']"));
//		goDate.click();
//		driver.findElement(By.xpath("//div[text()='Return']/following-sibling::input[contains(@class,'input')]")).click();
//		driver.findElement(By.xpath("(//td[@data-date='05112023'])[2]")).click();
//		driver.findElement(By.xpath("//button[text()='Search']")).click();
//		Thread.sleep(3000);
//		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='result-col outr']/descendant::div[@class='price']/descendant::span[text()<6000]/ancestor::div[@class='summary-section']/descendant::div[@class='airline-text']"));
//		for(int i=0;i<prices.size();i++) {
//			String flights = prices.get(i).getText();
//			System.out.println(flights);
//			
//		}
		driver.get("https://www.bankexamstoday.com/2019/06/countries-capital-currency-and-languages.html");
		List<WebElement> country = driver.findElements(By.xpath("//table//tr//td[contains(text(),'English')]/preceding-sibling::td[contains(text(),'dollar')]/preceding-sibling::td[2]"));
		for(int i=0;i<country.size();i++) {
			String countries = country.get(i).getText();
			System.out.println(countries);
		}
		
		
		
		
		
		
	}
}
