package myPackage;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
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
		driver.quit();
	}

}
