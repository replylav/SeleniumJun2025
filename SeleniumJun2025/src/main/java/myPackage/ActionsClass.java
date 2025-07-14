package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement start = driver.findElement(By.xpath("//div[@id='dragarea']"));  // WebElement
		WebElement end = driver.findElement(By.id("droparea"));
		Actions action = new Actions(driver);
		action.dragAndDrop(start, end).perform();
		action.contextClick(start).perform();  // Right click
		action.doubleClick(end).perform();
		action.clickAndHold(end);
		Thread.sleep(2000);
		WebElement interactions = driver.findElement(By.xpath("//a[@href='Interactions.html']"));
		WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement statics = driver.findElement(By.xpath("//a[@href='Static.html']"));
		action.moveToElement(interactions).moveToElement(dragAndDrop)
		.moveToElement(statics).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
