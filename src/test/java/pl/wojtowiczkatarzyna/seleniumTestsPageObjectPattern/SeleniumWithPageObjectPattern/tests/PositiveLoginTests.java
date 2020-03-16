package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.FooterPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LandingPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LoginPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.TopMenuPage;

public class PositiveLoginTests extends TestsBase {

	@Test
	public void asUserLoginUsingValidLoginAndPassword() {

		LandingPage landingPage = new LandingPage();
		landingPage.clickOnEnterStoreLink();

		TopMenuPage topMenuPage = new TopMenuPage();
		topMenuPage.clickOnSignInLink();

		LoginPage loginPage = new LoginPage();
		loginPage.typeIntoUserNameField("j2ee");
		loginPage.typeIntoPasswordField("j2ee");
		loginPage.clickOnLoginButton();
		FooterPage footerPage = new FooterPage();
		assertTrue(footerPage.isBannerAfterLoginDisplayed());
	}

}
