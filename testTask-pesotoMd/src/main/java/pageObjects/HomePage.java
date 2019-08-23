package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dataProviders.ConfigFileReader;

public class HomePage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		configFileReader = new ConfigFileReader();
	}

	By registerLink = By.linkText("Înregistrare");
	
	public void navigateTo_HomePage() {
		driver.get(configFileReader.getApplicationUrl());
	}

	public void clickRegisterLink() {
		driver.findElement(registerLink ).click();
	}
}


