package stepDefinitions;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

	WebDriver driver;

	LoginPage loginPage;
	ConfigReader config = new ConfigReader();

	@Given("User launches browser")
	public void user_launches_browser() {

		DriverFactory.getDriver();

		DriverFactory.getDriver().get(config.getURL());
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.clickMyAccount();
		loginPage.clickLogin();

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		loginPage =new LoginPage(DriverFactory.getDriver());
		
		loginPage.enterEmail(config.getEmail());
		loginPage.enterPassword(config.getPassword());

	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		loginPage.clickLoginButton();

	}

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {

		System.out.println("Login Successful...");

	}

}
