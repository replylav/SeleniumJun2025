package myPackage;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations extends Test_noduplicate{
	
	@Test
	public void HandleMultipleTabs() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Windows.html");
		// Open new tab
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		// Switch to new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(500);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(700);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(700);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(700);
		driver.switchTo().window(tabs.get(1));
	}
	
	@Test
	public void Alerts() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.id("OKTab")).click();
		Thread.sleep(1200);
		driver.switchTo().alert().accept();   // dismiss();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1200);
		alert.dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Thread.sleep(1200);
		Alert input = driver.switchTo().alert();
		input.sendKeys("Its a beautifull day!");
		input.accept();
		Thread.sleep(1000);
	}

}
