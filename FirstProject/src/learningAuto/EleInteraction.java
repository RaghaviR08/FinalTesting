package learningAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.Context.Key;

public class EleInteraction {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Out");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")));
		// click on the compose button as soon as the "compose" button is visible
		WebElement InitialEle = driver.findElement(By.xpath("//input[@title='Search']"));
		InitialEle.click();
		InitialEle.sendKeys("Learn automation Online" +Keys.ENTER);
		
		

		
		
		
				

	}

}
