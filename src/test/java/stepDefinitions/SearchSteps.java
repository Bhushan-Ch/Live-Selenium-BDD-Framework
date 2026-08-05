package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import utils.DriverFactory;

public class SearchSteps {
	
	SearchPage searchPage;

    @When("User searches products {string}")
    public void searchProduct(String product) {

        searchPage =
        new SearchPage(
        DriverFactory.getDriver());

        searchPage.searchProduct(product);

        searchPage.clickSearch();
    }

//    @Then("Product should display successfully")
//    public void verifySearch() {
//
//        System.out.println(
//        "Product Displayed");
    
    @Then("Product should displayed successfully")
    public void product_should_displayed_successfully() {
    	
    	System.out.println(
    	        "Product Displayed");
       
    }
	
	

}
