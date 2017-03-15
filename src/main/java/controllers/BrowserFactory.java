package controllers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @Author Gladson Antony
 * @Date 08-Feb-2017
 */

public class BrowserFactory extends InitMethod
{
	@SuppressWarnings("deprecation")
	static WebDriver createDriver(String browser, String url) throws Exception
	{
		WebDriver driver;

		DesiredCapabilities capabilities;
		switch(browser.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			break;

		case  "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/geckodriver.exe");
			DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
			capabilitiesFirefox.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new FirefoxDriver(capabilitiesFirefox);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			break;

		case  "ie":
			System.setProperty("webdriver.ie.driver", "src/main/resources/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(url);
			break;	

		case  "edge":
			System.setProperty("webdriver.edge.driver", "src/main/resources/Drivers/MicrosoftWebDriver.exe");
			DesiredCapabilities capabilitiesEdge = DesiredCapabilities.edge();
		    driver = new EdgeDriver(capabilitiesEdge);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			break;

		case  "unit":
			driver = new HtmlUnitDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			break;

		case  "opera":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
			capabilities = DesiredCapabilities.opera();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:/Program Files/Opera/launcher.exe");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			break;
			
		default:
			throw new Exception("Please Provide a Valid Browser");
		}
		return driver;		
	}
}
