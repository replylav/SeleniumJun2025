package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourCartPage extends BasePage {
	
	public yourCartPage(WebDriver driver) {
		super(driver);
	}
	
	//1. Page Elements
	
	@FindBy(name="checkout")
	WebElement checkoutBtn;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement remove;
	
	//2. Page Actions

	public void clickCheckout() {
		checkoutBtn.click();
	}
	
	public void clickRemove() {
		remove.click();
	}
	
	
}
