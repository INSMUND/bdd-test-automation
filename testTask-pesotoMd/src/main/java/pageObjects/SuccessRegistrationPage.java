package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessRegistrationPage {
	WebDriver driver;
	By registrationSuccessMessage = By.tagName("h1");

	public SuccessRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean success_registration_Message_is_present() {
		return driver.findElement(registrationSuccessMessage).isDisplayed();
	}

}
