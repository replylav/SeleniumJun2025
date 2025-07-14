package myPackage;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo extends Test_noduplicate {
	
	@Test
	public void HandleFrames() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame= driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("122323");
		}
	
	@Test
	public void SeleniumWait() throws InterruptedException {
		driver.get("https://www.walmart.com");   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement logo = driver.findElement(By.xpath("//img[@data-automation-id='header-walmartLogo']"));
		wait.until(ExpectedConditions.visibilityOf(logo));
		System.out.println("Walmart logo is displayed....");
	}
}
