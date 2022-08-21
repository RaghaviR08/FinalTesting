package testNGExample;

import org.testng.annotations.Test;

public class TestNGEx1 {

	@Test(priority = 0)
	public void firstTestCase() {
		System.out.println("This is First Test case");
	}
	@Test(priority = 1)
	public void secondTestCase() {
		System.out.println("This is Second Test case");
	}
	@Test(priority = 2)
	public void thirdTestCase() {
		System.out.println("This is Third Test case");
	}
	@Test(priority = 3,enabled=false)
	public void fourthTestCase() {
		System.out.println("This is Fourth Test case");
	}
	
}
