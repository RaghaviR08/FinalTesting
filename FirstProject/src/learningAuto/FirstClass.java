package learningAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		//Find all Elements
		
		WebElement Edit = driver.findElement(By.xpath("//img[@src=\"images/edit.png\"]"));
		Edit.click();
		
		WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));
		emailbox.sendKeys("ragh.r@gmail.com");
		WebElement Append = driver.findElement(By.xpath("//input[@value='Append ']"));
		Append.sendKeys("valueAppended");
		WebElement Val = driver.findElement(By.xpath("//input[@name='username'][1]"));
		String str=Val.getAttribute("Value");
		System.out.println(str);
		WebElement Clearbox = driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]"));
		Clearbox.clear();
	}

}
