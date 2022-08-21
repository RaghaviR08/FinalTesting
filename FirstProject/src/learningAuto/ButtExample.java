package learningAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ButtExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/interest-calculator.html");
		WebElement Btn = driver.findElement(By.xpath("//select[@id='ccompound']"));
		Btn.click();
		Select sel=new Select(Btn);
		sel.selectByIndex(1);
		List <WebElement> lis =sel.getOptions();
		int sizee=lis.size();
		System.out.println(sizee);
		
		WebElement ClrBtn = driver.findElement(By.xpath("//span[@id='bluebtn']"));
		Point xyp =ClrBtn.getLocation();
		int xval = xyp.getX();	
		int yval = xyp.getY();
		System.out.println(xval+ " and "+yval);
		String clr=ClrBtn.getCssValue("color");
		System.out.println(clr);

	int ht=ClrBtn.getSize().getHeight();
	int wt=ClrBtn.getSize().getWidth();
		System.out.println(ht+" and "+wt);
		driver.quit();
	}

}
