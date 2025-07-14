package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BooleanOperations {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	boolean cricket = driver.findElement(By.id("checkbox1")).isDisplayed();
	System.out.println(cricket);
	driver.findElement(By.id("checkbox2")).click();
	boolean movies = driver.findElement(By.id("checkbox2")).isSelected();
	System.out.println(movies);
	boolean enabled = driver.findElement(By.id("checkbox2")).isEnabled();
	System.out.println(enabled);
	driver.quit();
	}

}
