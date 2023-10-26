package self;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CombinedSeleniumScripts {
	@Test
public void combo() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Alerts.html");
    Actions a=new Actions(driver);
    WebElement sw = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
    a.moveToElement(sw).click().perform();
    driver.findElement(By.xpath("//a[text()='Windows']")).click();
    driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
    driver.findElement(By.xpath("//button[text()='click ']")).click();
    Set<String> allwin = driver.getWindowHandles();
    Iterator<String> cwh=allwin.iterator();
    String cwh1 = cwh.next();
    String cwh2= cwh.next();
    String cwh3= cwh.next();
    driver.switchTo().window(cwh2);
    driver.close();
    driver.switchTo().window(cwh3);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='Email id for Sign Up']")).sendKeys("pradhap123");
    driver.findElement(By.id("enterimg")).click();
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("pradhap");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sachin10");
    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("salem");
    driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("pradhapraj1045@gmail.com");
    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9677612053");
    driver.findElement(By.name("radiooptions")).click();
    driver.findElement(By.id("checkbox1")).click();
    driver.findElement(By.id("checkbox2")).click();
    WebElement language = driver.findElement(By.id("msdd"));
    a.moveToElement(language).click().perform();
     WebElement skills = driver.findElement(By.id("Skills"));
     a.click(skills).perform();
    Select s1=new Select(skills);
    s1.selectByVisibleText("Java");
    WebElement country = driver.findElement(By.id("countries"));
    a.click(country).perform();
    Select s2=new Select(country);
    s2.selectByVisibleText("Select Country");
    driver.findElement(By.xpath("//span[@role='combobox']")).click();
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    WebElement year = driver.findElement(By.id("yearbox"));
    Select s3=new Select(year);
    s3.selectByValue("1997");
    WebElement mon = driver.findElement(By.xpath("//select[@placeholder='Month']"));
    Select s4=new Select(mon);
    s4.selectByVisibleText("May");
    WebElement day = driver.findElement(By.id("daybox"));
    Select s5=new Select(day);
    s5.selectByValue("25");
    driver.findElement(By.id("firstpassword")).sendKeys("Sachin10");
    driver.findElement(By.id("secondpassword")).sendKeys("Sachin10");
    driver.findElement(By.id("submitbtn")).click();
}
}
