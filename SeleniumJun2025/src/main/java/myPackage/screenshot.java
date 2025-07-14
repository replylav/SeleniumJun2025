package myPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		// 1. Take the screenshot 
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//2. save it to any folder, .png, jpg/jpeg
        Files.copy(screenshot.toPath(), new File("screenshot.png").toPath(), StandardCopyOption.REPLACE_EXISTING);	
        driver.quit();
	}

}
