package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new EdgeDriver();  //1. Open the browser 
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   driver.findElement(By.name("q")).sendKeys("Selenium interview questions"+ Keys.ENTER);
	   driver.get("https://www.saucedemo.com/");
	   driver.findElement(By.name("user-name")).clear();
	  driver.findElement(By.className("btn_action")).click();
	  driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user"); // 1. tagname#id 2. tagname.className
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.cssSelector("input.btn_action")).click();
	  driver.findElement(By.tagName("title"));
	  driver.get("https://demoqa.com/links");
	  driver.findElement(By.linkText("Home"));
	  driver.findElement(By.partialLinkText("Hom")).click();
	  driver.quit();
	}

}
