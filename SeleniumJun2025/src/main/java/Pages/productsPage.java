package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {
	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	//1. Page Elements
	
	@FindBy(id="item_4_title_link")
	WebElement backPack;
	
	@FindBy(id="item_0_title_link")
	WebElement bikeLight;
	//1. Page Action
	
	public void clickBackPack() {
		backPack.click();
	}
	
	public void clickBikeLight() {
		bikeLight.click();
	}

}
