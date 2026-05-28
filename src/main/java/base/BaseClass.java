package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitHelper;

public class BaseClass {

	WebDriver driver;

	WaitHelper waitHelper;

	public BaseClass(WebDriver driver) {

		this.driver = driver;
		waitHelper = new WaitHelper(driver);

	}

	public void click(By locator) {

		waitHelper.waitForElementClickable(locator).click();
	}

	public void type(By locator, String value) {

		waitHelper.waitForElementVisible(locator).sendKeys(value);
	}

	public String getText(By locator) {

		return waitHelper.waitForElementVisible(locator).getText();
	}
}
