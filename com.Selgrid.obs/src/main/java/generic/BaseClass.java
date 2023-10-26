package generic;

	import java.net.MalformedURLException;

	import java.net.URL;


	import org.openqa.selenium.Platform;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	public class BaseClass 
	{   public RemoteWebDriver driver;
		@Parameters("browser")
		@BeforeClass
		public void config(String BROWSER) throws MalformedURLException 
		{
			URL url= new URL("http://192.168.83.252:4444/grid/register/");
			DesiredCapabilities cap =new DesiredCapabilities();
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
			driver=new RemoteWebDriver(url,cap);
		}

	
	}
	

