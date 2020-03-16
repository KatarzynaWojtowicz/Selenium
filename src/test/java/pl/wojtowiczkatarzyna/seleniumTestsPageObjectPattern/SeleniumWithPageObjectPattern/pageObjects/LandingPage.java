package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;

public class LandingPage {

	@FindBy(css = "#Content a")
	private WebElement enterStoreLink;

	public LandingPage() {
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	public void clickOnEnterStoreLink() {
		enterStoreLink.click();
	}
}
