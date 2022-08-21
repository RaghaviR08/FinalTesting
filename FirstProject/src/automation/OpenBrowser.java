package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws IOException {
		WebDriver driver =null;
		FileInputStream stream = new FileInputStream("config.properties");
		Properties property = new Properties();
			property.load(stream);
			String Browser = property.getProperty("browser");
			String DriverLocation = property.getProperty("DriverLocation");
		
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverLocation);
			driver = new  ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", DriverLocation);
			driver = new  FirefoxDriver();	
		}
		driver.get("https://demoqa.com/text-box");
	}

}
