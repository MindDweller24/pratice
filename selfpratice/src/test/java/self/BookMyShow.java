package self;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookMyShow {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();	
//		 driver.get("https://cosmocode.io/automation-practice-webtable/");
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 WebElement more = driver.findElement(By.xpath("(//a[text()='More'])[2]"));
//		 Actions act=new Actions(driver);
//		 act.moveToElement(more).click().perform();
//		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'WebTable')])[2]")));
//		 driver.findElement(By.xpath("(//a[contains(text(),'WebTable')])[2]")).click();
//		 List<WebElement> dollar = driver.findElements(By.xpath("//td[contains(text(),'English')]/parent::tr//child::td[contains(text(),'Dollar')]"));
//		 for(int i=0;i<dollar.size();i++) {
//			String text = dollar.get(i).getText();
//			System.out.println(text);
//		 }
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.timeanddate.com/worldclock/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> texts = driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/descendant::tbody/child::tr"));
			for(int i=0;i<texts.size();i++) {
				String times = texts.get(i).getText();
				System.out.println(times);
			}
			
		 
//			public void printHeightWidth() {
//				WebDriver driver=new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.get("https://www.facebook.com/");
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.titleIs("facebook"));
//				WebElement loginBtn = driver.findElement(By.name("login"));
//				int height = loginBtn.getSize().getHeight();
//				int width = loginBtn.getSize().getWidth();
//				if(height==width) {
//					System.out.println("both are equal");
//				}
//				else {
//					System.out.println("both are notequal");
//				}
//		WebDriver driver=new ChromeDriver();
//      driver.manage().window().maximize();
//		driver.get("https://www.letskodeit.com/practice");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250s)","");
//		driver.findElement(By.id("hide-textbox")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("displayed-text")).sendKeys("sanats kingdom");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('displayed-text').value='sanats kingdom';");
//		driver.findElement(By.id("show-textbox")).click();
		
//		driver.get("https://www.google.com/search?q=worldcup+pointtable&rlz=1C1ONGR_enIN1009IN1009&oq=worldcup+pointtable&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCjExNTUyajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8#sie=lg;/m/0w61w3s;5;/m/021vk;st;fp;1;;;");
//		WebElement header = driver.findElement(By.xpath("(//div[@class='tb_sh'])[1]/child::ol"));
//		String head = header.getText();
//		System.out.println(head);
//		List<WebElement> list = driver.findElements(By.xpath("(//table[@class='Jzru1c'])[1]/descendant::tr"));
//		for(int i=0;i<list.size();i++) {
//			String teams = list.get(i).getText();
//			System.out.print(teams);
//		}
	}

}
