package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PricePage;
import pages.QuotePage;

public class PriceStepDefinition {
	PricePage page = new PricePage();
	
	@When("I select the price")
	public void i_select_the_price() {
		page.selectPriceGOld();
	}

	@Then("the system should redirect to the Send Quote tab")
	public void the_system_should_redirect_to_the_Send_Quote_tab() {
		QuotePage pageq = new QuotePage();
		assertEquals(page.returnTextTabSelected(), pageq.returnTextTabQuote());
	}

}
