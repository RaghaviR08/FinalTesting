package testNGExample;

import org.testng.annotations.Test;

public class DependanciesMgmt {

	@Test
	public void highschool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highschool")
	public void higherSecondarySchool() {
		System.out.println("Higher Sec School");
	}
	@Test(dependsOnMethods = "higherSecondarySchool")
	public void Engineering() {
		System.out.println("Engineering");
	}
}
