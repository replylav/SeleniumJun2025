package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	public loginPage(WebDriver driver) {
	super(driver);
	}


	// 1. Page Elements 

	@FindBy(id="user-name")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(name="login-button")
	WebElement loginBtn;

	//2. Page Actions

	public void enterUsername() {
		username.sendKeys("standard_user");
	}

	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}

	public void clickLogin() {
		loginBtn.click();
	}


	
	







}
