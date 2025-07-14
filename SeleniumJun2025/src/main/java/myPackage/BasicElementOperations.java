package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicElementOperations {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).submit();
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByValue("Mobile");
		skills.selectByVisibleText("Networks");
		skills.selectByIndex(4);
		driver.get("https://demoqa.com/select-menu");
		Select multi = new Select(driver.findElement(By.id("cars")));
		multi.selectByValue("volvo");
		multi.selectByVisibleText("Saab");
		multi.selectByIndex(3);
		multi.deselectByIndex(3);
		multi.deselectAll();
		driver.quit();
	}

}
