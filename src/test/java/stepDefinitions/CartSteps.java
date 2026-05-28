package stepDefinitions;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import utils.DriverFactory;

public class CartSteps {

	CartPage cartPage;
	
	@When("User searches product {string}")
	public void SerachProudct(String proudct) {

		cartPage = new CartPage(DriverFactory.getDriver());

		cartPage.searchProduct(proudct);
		cartPage.clickSearch();

	}

	@When("User adds product to cart")
	public void AddToCart() {

		cartPage.clickAddToCart();

	}

	@Then("Product should be added successfully")
	public void verifyCart() {

		System.out.println("Product Added Successfully");

	}

}
