package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();  // Opening the browser: Initialization 
		driver.get("https://www.google.com");
		driver.get("https://www.kiwi.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.err.println(driver.getPageSource());
		driver.quit();    // to close the browser
		
	}

}
