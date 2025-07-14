package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends BasePage{
	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement submit;
	
	public void enterdetails() {
		firstName.sendKeys("Lavanya");
		lastName.sendKeys("P");
		postalCode.sendKeys("324234234");
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
}
