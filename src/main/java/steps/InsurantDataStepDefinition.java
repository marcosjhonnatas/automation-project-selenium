package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurantDataPage;
import pages.VehicleDataPage;

public class InsurantDataStepDefinition {
	InsurantDataPage page = new InsurantDataPage();

	
	@Given("that I am on the insurant form")
	public void that_I_am_on_the_insurant_form() {
		page.clickInTabInsurant();
	}

	@When("I fill in the valid data of insurance")
	public void i_fill_in_the_valid_data_of_insurance() {
		page.sendFirstName("Marcos");
		page.sendLastName("Pereira");
		page.sendBirthdate("06/15/1996");
		page.selectGenderMale();
		page.sendStreetaddress("Quadra6 Conjunto A, Bloco E Edifício Business Center Park Shs Sala 817, Brasília - DF, 70322-915");
		page.selectCountry("Brazil");
		page.sendZipcode("71.880-164");
		page.sendCity("BRASILIA");
		page.selectOccupation("Public Official");
		page.selectHobbeSpeeding();
		page.sendWebsite("https://www.speedtest.net/pt");
//		page.clickInOpenButton();
		
	}

	@Then("the system should redirect to the Enter Product Data tab")
	public void the_system_should_redirect_to_the_Enter_Product_Data_tab() {

	}

}
