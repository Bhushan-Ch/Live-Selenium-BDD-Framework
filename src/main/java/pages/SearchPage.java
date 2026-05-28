package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class SearchPage extends BaseClass {
	WebDriver driver;

	By searchBox = By.name("search");

	By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");

	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public void searchProduct(String product) {
		type(searchBox, product);

	}

	public void clickSearch() {
		click(searchBtn);

	}
}
