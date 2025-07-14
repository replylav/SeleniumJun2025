package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']")); //1. Scroll to element
		JavascriptExecutor js = (JavascriptExecutor)driver;				
		js.executeScript("arguments[0].scrollIntoView(true);", help);
		js.executeScript("window.scrollBy(10, 31)");  //2. scroll by coordinates(not recommended)
		driver.quit();
	}
}
