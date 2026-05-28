package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class CartPage extends BaseClass {

	WebDriver driver;

	By searchBox = By.name("search");

	By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

	By addToCart = By.xpath("(//span[text()='Add to Cart'])[1]");

	public CartPage(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public void searchProduct(String product) {

		type(searchBox, product);
	}

	public void clickSearch() {

		click(searchButton);
	}

	public void clickAddToCart() {

		click(addToCart);
	}

}
