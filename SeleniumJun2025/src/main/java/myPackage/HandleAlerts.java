package myPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
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
			Thread.sleep(2000);
			driver.quit();		
	}
}
