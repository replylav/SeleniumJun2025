package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InPrivateWindow {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("inprivate");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
