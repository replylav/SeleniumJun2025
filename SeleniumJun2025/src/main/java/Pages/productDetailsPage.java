package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePage {

	public productDetailsPage(WebDriver driver) {
	super(driver);
	}

	// 1. Page Elements
	@FindBy(xpath="//button[@name='add-to-cart']")
	WebElement addToCart;

	@FindBy(className ="shopping_cart_badge")
	WebElement cart;

	@FindBy(id="remove")
	WebElement removeBtn;

	//2. Page Actions
	public void clickAddToCart() {
		addToCart.click();
	}

	public void clickCart() {
		cart.click();
	}



}
