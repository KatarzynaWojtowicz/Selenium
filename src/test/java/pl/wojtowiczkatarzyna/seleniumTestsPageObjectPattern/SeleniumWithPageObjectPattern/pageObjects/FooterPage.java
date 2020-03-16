package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;

public class FooterPage {
	@FindBy(css = "#Banner img[src*='dog']")
	private WebElement bannerAfterLoginLogo;

	public FooterPage() {
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	public boolean isBannerAfterLoginDisplayed() {
		boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();
		return isDisplayed;
	}

}
