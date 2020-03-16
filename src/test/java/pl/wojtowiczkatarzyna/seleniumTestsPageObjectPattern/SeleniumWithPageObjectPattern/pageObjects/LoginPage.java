package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;

public class LoginPage {

	@FindBy(name = "username")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(name = "signon")
	private WebElement signOnButton;

	@FindBy(css = "#Content ul[class='messages'] li")
	private WebElement messageLabel;

	@FindBy(css = "area[alt='Fish']")
	private WebElement btnFishImage;

	public LoginPage() {
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	public void typeIntoUserNameField(String username) {
		usernameField.clear();
		usernameField.sendKeys(username);
	}

	public void typeIntoPasswordField(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		signOnButton.click();
	}

	public String getWarningMessage() {
		String warningText = messageLabel.getText();
		return warningText;
	}

	public void clickOnFishButton() {
		btnFishImage.click();
	}
}
