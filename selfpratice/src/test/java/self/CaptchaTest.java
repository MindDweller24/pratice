package self;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaptchaTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver (1).exe");
	}
	public static void main(String[] args) throws IOException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		driver.findElement(By.id("4584299")).sendKeys("pradhaprajs");
		driver.findElement(By.id("593982")).sendKeys("593982");
		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		File src = captcha.getScreenshotAs(OutputType.FILE);
		String path = "D:\\TY_NOTES\\ss";
		FileUtils.copyFile(src, new File(path));
		
		
		
	}

}
