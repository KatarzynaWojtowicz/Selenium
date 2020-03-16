package pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverManager;
import pl.wojtowiczkatarzyna.seleniumTestsPageObjectPattern.SeleniumWithPageObjectPattern.driverManager.DriverUtils;

public class TestsBase {

	public WebDriver driver;

	@Before
	public void beforeTest() {

		driver = DriverManager.getWebDriver();
		DriverUtils.setInitialConfiguration();
		DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
	}

	@After
	public void afterTest() {
		DriverManager.disposeDriver();
	}

}
