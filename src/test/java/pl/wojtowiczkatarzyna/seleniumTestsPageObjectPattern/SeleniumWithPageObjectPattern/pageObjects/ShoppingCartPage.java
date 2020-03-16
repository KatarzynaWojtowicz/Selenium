package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;

public class ShoppingCartPage {

	@FindBy(css = "a[href$='newOrderForm=']")
	private WebElement proceedToCheckoutButton;

	public ShoppingCartPage() {
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	public void clickOnProceedToCheckout() {
		proceedToCheckoutButton.click();
	}

}
