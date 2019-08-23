package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.ActivePage;
import pageObjects.HomePage;
import pageObjects.RegistrationFormPage;
import pageObjects.SuccessRegistrationPage;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private RegistrationFormPage registrationFormPage;
	private SuccessRegistrationPage successRegistrationPage;
	private ActivePage activePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public RegistrationFormPage getRegistrationFormPage() {
		return (registrationFormPage == null) ? registrationFormPage = new RegistrationFormPage(driver)
				: registrationFormPage;
	}

	public SuccessRegistrationPage getSuccessRegistrationPagee() {
		return (successRegistrationPage == null) ? successRegistrationPage = new SuccessRegistrationPage(driver)
				: successRegistrationPage;
	}

	public ActivePage getActivePage() {
		return (activePage == null) ? activePage = new ActivePage(driver) : activePage;
	}
}
