package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;
import Pages.yourCartPage;

public class swagLabsTest extends BaseTest {
	
	
	@Test
	public void shopping() {
		loginPage lp = new loginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		productsPage pp = new productsPage(driver);
		pp.clickBackPack();
		productDetailsPage pdp = new productDetailsPage(driver);
		pdp.clickAddToCart();
		pdp.clickCart();
		yourCartPage cp = new yourCartPage(driver);
		cp.clickCheckout();
		infoPage ip = new infoPage(driver);
		ip.enterdetails();
		overviewPage op = new overviewPage(driver);
		op.clickFinish();
		completePage comp = new completePage(driver);
		String header = comp.getHeader();
		comp.clickHome();
		Assert.assertEquals(header, "Thank you for your order!");
	}

	

}
