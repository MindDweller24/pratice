package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebUtility {
	public void maximizeWindow(WebDriver cd) {
		cd.manage().window().maximize();
		
	}
	
	public void implicitlyWait(WebDriver cd) {
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
