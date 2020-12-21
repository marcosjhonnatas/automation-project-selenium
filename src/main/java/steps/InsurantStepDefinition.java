package steps;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurantPage;
import pages.ProductPage;

public class InsurantStepDefinition {
	InsurantPage page = new InsurantPage();

	@Given("that I am on the insurant form")
	public void that_I_am_on_the_insurant_form() {
		page.clickInTabInsurant();
	}

	@When("I fill in the valid data of insurance")
	public void i_fill_in_the_valid_data_of_insurance() {
		page.insertFirstName("Marcos");
		page.insertLastName("Pereira");
		page.insertBirthdate("06/15/1996");
		page.selectGenderMale();
		page.insertStreetaddress("Quadra6 Conjunto A, Bloco E Edifício Business Center Park Shs Sala 817, Brasília - DF, 70322-915");
		page.selectCountry("Brazil");
		page.sendZipcode("3000");
		page.sendCity("BRASILIA");
		page.selectOccupation("Public Official");
		page.selectHobbeSpeeding();
		page.insertWebsite("https://www.speedtest.net/pt");
	}

	@Then("the system should redirect to the Enter Product Data tab")
	public void the_system_should_redirect_to_the_Enter_Product_Data_tab() {
		ProductPage ppage = new ProductPage();
		assertEquals(page.returnTextTabSelected(), ppage.returnTextTabProduct());
	}

}
