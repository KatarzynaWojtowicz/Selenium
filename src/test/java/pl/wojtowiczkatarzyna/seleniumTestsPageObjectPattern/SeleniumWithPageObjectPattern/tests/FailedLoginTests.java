package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LandingPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.LoginPage;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects.TopMenuPage;

public class FailedLoginTests extends TestsBase {

	@Test
	public void asUserTryToLogInWithIncorrectLoginAndPassword() {
		LandingPage landingPage = new LandingPage();
		landingPage.clickOnEnterStoreLink();
		TopMenuPage topMenuPage = new TopMenuPage();
		topMenuPage.clickOnSignInLink();

		LoginPage loginPage = new LoginPage();

		loginPage.typeIntoUserNameField("NotExistingLogin");
		loginPage.typeIntoPasswordField("NotProperPassword");
		loginPage.clickOnLoginButton();
		String warningMessage = loginPage.getWarningMessage();

		assertEquals("Invalid username or password. Signon failed.", warningMessage);
	}
}
