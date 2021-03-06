package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivePage {
	WebDriver driver;
	By activeAccountMessage = By.tagName("h1");

	public ActivePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean active_account_Message_is_present() {
		return driver.findElement(activeAccountMessage).isDisplayed();
	}

}
