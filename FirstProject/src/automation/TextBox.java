package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/text-box");
		
	}
	  public void Defineelement() {
		WebElement name=driver.findElement(By.id("userName"));
		WebElement mail=driver.findElement(By.id("userEmail"));
		WebElement addr=driver.findElement(By.id("currentAddress"));
		WebElement Addrp=driver.findElement(By.id("permanentAddress"));
		  name.sendKeys("Tittu");
				mail.sendKeys("Tittu.R@gmail.com");
				addr.sendKeys("ABC");
				Addrp.sendKeys("DEF");
		//driver.close();
	}
	  public void Actions() {
	
	  }

}
