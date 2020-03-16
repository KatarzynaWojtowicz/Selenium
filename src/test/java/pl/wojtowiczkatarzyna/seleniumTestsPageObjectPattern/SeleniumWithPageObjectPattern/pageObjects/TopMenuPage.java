package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;

public class TopMenuPage {

	@FindBy(css = "#MenuContent a[href*='signonForm']")
	private WebElement signIn;

	public TopMenuPage() {
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	public void clickOnSignInLink() {
		signIn.click();
	}
}
