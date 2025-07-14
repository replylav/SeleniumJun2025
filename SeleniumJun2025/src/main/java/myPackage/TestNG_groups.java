package myPackage;

import org.testng.annotations.Test;

public class TestNG_groups {
	
	
	@Test(groups = {"important"})
	public void apple() {
		System.out.println("Apple");
	}
	
	@Test(groups= {"important"})
	public void samsung() {
		System.out.println("Samsung");
	}
	@Test(groups= {"not so important"})
	public void oneplus() {
		System.out.println("Oneplus+");
	}
	@Test(groups= {"not so important"})
	public void xiomi() {
		System.out.println("Xiomi");
	}
	@Test(groups= {"important"})
	public void redmi() {
		System.out.println("Redmi");
	}

}
