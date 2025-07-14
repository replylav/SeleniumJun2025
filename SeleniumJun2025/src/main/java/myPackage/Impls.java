package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Impls implements CallingScreen {

	public static void main(String[] args) {
		CallingScreen obj = new Impls();
		WebDriver driver = new EdgeDriver();
		EdgeDriver driver1 = new EdgeDriver();
		driver = new ChromeDriver();
		driver1.get("https://www.google.com");
	}
	
	public void accept() {
		System.out.println("Incoming call....Accepted");
	}

	
	
	public void Reject() {
		System.out.println("Rejected the call with message");
	}
}
