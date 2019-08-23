package stepDefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import Utils.EmailContentParser;
import Utils.EmailOperator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageObjects.ActivePage;

public class ActivationAccountFromConfirmationEmailStepDefinition {
	TestContext testContext;
	PageObjectManager pageObjectManager;
	ActivePage activePage;
	EmailOperator emailOperator;
	String confirmationEmailContent = null;
	String linkToActivate;
	static Logger log = Logger.getLogger(ActivationAccountFromConfirmationEmailStepDefinition.class);
	public ActivationAccountFromConfirmationEmailStepDefinition(TestContext context) {
		testContext = context;
		activePage = testContext.getPageObjectManager().getActivePage();
	}

	@Given("^user finds confirmation email in list of inbox email noticed in Registration form (.+) password (.+) server (.+) port (.+)$")
	public void get_list_inbox_email(String IMAP_AUTH_EMAIL, String IMAP_AUTH_PWD, String IMAP_Server,
			String IMAP_Port) {
		PropertyConfigurator.configure("log4j.properties");
		confirmationEmailContent = new EmailOperator().FindEmailConfirmationContent(IMAP_AUTH_EMAIL, IMAP_AUTH_PWD,
				IMAP_Server, IMAP_Port);
		log.info("Content from registration confirmation email is obtained :"+confirmationEmailContent);
	}

	@When("^user finds in email confirmation a link to activate account$")
	public void find_link_activate_account() {
		if (!confirmationEmailContent.isEmpty()) {
			linkToActivate = new EmailContentParser().letterConfirmationContentParse(confirmationEmailContent);
			System.out.println(linkToActivate);
			log.info("Link to activate account is: "+linkToActivate);
		}
	}

	@When("^user get the link$")
	public void get_link_activate_account() {
		testContext.getWebDriverManager().getDriver().get(linkToActivate);
		log.info("user get link to activate account: "+linkToActivate);
	}

	@Then("^the webpage with message Pagina activata in romanian version or Страница активирована in russian appears$")
	public void account_is_activated() {
		Assert.assertTrue(activePage.active_account_Message_is_present());
		if (activePage.active_account_Message_is_present()) {
			log.info("test passed - message success activation is displayed");
		}else {
			log.info("test failed - message success activation is not displayed");
		}
			
	}
}
