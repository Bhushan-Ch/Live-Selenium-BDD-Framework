package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {

			FileInputStream file = new FileInputStream("src/test/resources/config/config.properties");

			prop = new Properties();

			prop.load(file);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getURL() {

		return prop.getProperty("url");
	}

	public String getEmail() {

		return prop.getProperty("username");
	}

	public String getPassword() {

		return prop.getProperty("password");
	}
}