package fraamework1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageObjectExample {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
		WebElement CreateAcc=driver.findElement(By.xpath("//span[@class='laptop-desktop-only']"));
		CreateAcc.click();
		System.out.println("out1");
		 Thread.sleep(3000);
		 Thread.sleep(2000);
		WebElement Fname=driver.findElement(By.xpath("//input[@id='firstName']"));
		Fname.sendKeys("Tasha");
		WebElement Lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement Email=driver.findElement(By.xpath("//input[@id='username']"));
		Fname.sendKeys("Tasha");
		Lname.sendKeys("R");
		Email.sendKeys("Tasha.R.Tittu");
		
	}

}
