package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectRepository extends Basic{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		Basic ob=new Basic();
		ob.driver=new ChromeDriver();
		ob.driver.get("https://demoqa.com/text-box");
	WebElement T_User =ob.driver.findElement( By.xpath("//input[@id='userName']") );
	WebElement T_Mail =ob.driver.findElement( By.id ("userEmail"));
	WebElement T_Address =ob.driver.findElement( By.id ("currentAddress"));
	WebElement T_PAddress =ob.driver.findElement( By.id ("permanentAddress"));
}
}