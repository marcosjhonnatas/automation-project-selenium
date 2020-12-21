package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.QuotePage;

public class QuoteStepDefinition {
	QuotePage page = new QuotePage();
	@When("I fill in the valid data of quote")
	public void i_fill_in_the_valid_data_of_quote() {
		page.insertEmail("teste@teste.com.br");
	    page.insertUserName("TestSousa");
	    page.insertPassword("M@4jnkjs7");
	    page.inserConfirmPassword("M@4jnkjs7");
	}
	
	@When("click in send button")
	public void click_in_send_button() {
		page.clickInSendEmailButton();
	}
	
	@Then("the system should display the message stating that the email was sent successfully")
	public void assertMessageSuccess() {
		assertEquals(page.returnTextSuccessMessage(), "Sending e-mail success!");
	}

}
