package myPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {     //1. Implicit wait 2. Explicit wait

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.walmart.com");   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 60s default: Implicit wait
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement logo = driver.findElement(By.xpath("//img[@data-automation-id='header-walmartLogo']"));
		wait.until(ExpectedConditions.visibilityOf(logo));
		System.out.println("Walmart logo is displayed....");
		driver.quit();
	}

}
