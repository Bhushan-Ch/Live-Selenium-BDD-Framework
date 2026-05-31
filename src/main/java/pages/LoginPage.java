package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;

	By myAccount = By.xpath("//span[text()='My Account']");

	By loginLink = By.linkText("Login");

	By email = By.id("input-email");

	By password = By.id("input-password");

	By loginBtn = By.xpath("//input[@value='Login']");

	public LoginPage(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public void clickMyAccount() {

	    System.out.println("Current URL : "
	            + driver.getCurrentUrl());

	    System.out.println("Title : "
	            + driver.getTitle());

	    System.out.println("My Account count : "
	            + driver.findElements(
	                By.xpath("//span[text()='My Account']")
	            ).size());

	    click(myAccount);
	}

	public void clickLogin() {

		click(loginLink);
	}

	public void enterEmail(String mail) {

		type(email, mail);
	}

	public void enterPassword(String pass) {

		type(password, pass);
	}

	public void clickLoginButton() {

		click(loginBtn);
	}
}