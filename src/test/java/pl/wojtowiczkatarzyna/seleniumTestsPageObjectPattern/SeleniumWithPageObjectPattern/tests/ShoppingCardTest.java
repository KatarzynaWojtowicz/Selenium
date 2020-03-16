package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.AngelfishListPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.FishListPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LandingPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LoginPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.ShoppingCartPage;

public class ShoppingCardTest extends TestsBase {

	@Test
	public void asNotLoggedInUserIShallNotProceedToCheckout() {
		LandingPage landingPage = new LandingPage();
		landingPage.clickOnEnterStoreLink();

		LoginPage loginPage = new LoginPage();
		loginPage.clickOnFishButton();

		FishListPage fishListPage = new FishListPage(driver);
		fishListPage.clickOnAngelfishId();

		AngelfishListPage angelfishListPage = new AngelfishListPage();
		angelfishListPage.clickOnAddToCartSmallAngelfish();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.clickOnProceedToCheckout();

		loginPage = new LoginPage();
		String warningMessage = loginPage.getWarningMessage();
		assertEquals(warningMessage,
				"You must sign on before attempting to check out. Please sign on and try checking out again.");

	}

}
