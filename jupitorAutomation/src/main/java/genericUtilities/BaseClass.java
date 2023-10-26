package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver cd;
	public WebUtility wlib = new WebUtility();
	public PropertiesFile plib  = new PropertiesFile();
	
	@BeforeSuite
	public void beforeSuitem() {
		System.out.println("DatabaseConnection");
	}
	
	@Parameters("browser")
	@BeforeClass
	
	public void beforeclass() {
		
		String Browser = "Chrome";
		if(Browser.equalsIgnoreCase("Chrome")) {
			cd = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")) {
			cd = new FirefoxDriver();
		}else {
			cd = new EdgeDriver();
		}
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("DatabaseConnection");
		//cd.close();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("DatabaseConnection");
	}
}
