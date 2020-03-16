package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelfishListPage {

	@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[3]/td[5]/a")
	private WebElement smallAngelfishAddToCartButton;

	private WebDriver driver;

	public AngelfishListPage() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCartSmallAngelfish() {
		smallAngelfishAddToCartButton.click();
	}
}
