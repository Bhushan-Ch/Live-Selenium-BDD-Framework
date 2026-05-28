package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverFactory;

public class Hooks {
	ConfigReader config = new ConfigReader();

	@Before

	public void launchBrowser() {

		String browser = System.getProperty("browser");

		if (browser == null) {

			browser = "chrome";
		}

		DriverFactory.initializeBrowser(browser);
		DriverFactory.getDriver().get(config.getURL());
	}

	@After

	public void closeBrowser() {

		DriverFactory.getDriver().quit();
	}
}