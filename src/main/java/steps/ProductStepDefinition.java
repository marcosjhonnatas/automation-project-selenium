package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.print.PageFormat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProductPage;

public class ProductStepDefinition {
	
	ProductPage page = new ProductPage();
	
	@Given("that I am on the product form")
	public void that_I_am_on_the_product_form() {
		page.clickInProductTab();
		System.out.println(page.returnTextTabSelected());
		assertEquals(page.returnTextTabProduct(), page.returnTextTabSelected());
	}

	@When("I fill in the valid data of product")
	public void i_fill_in_the_valid_data_of_product() {
		page.insertStartDate(GenericStep.sumYersInActualDate(1).toString());
		page.selectInsuranceSum(" 10.000.000,00");
		page.selectMeritRating("Bonus 2");
		page.selectDamageinsurance("No Coverage");
		page.selectOptionalProductEuroProtection();
		page.selectCourtesyCar("Yes");
	}
	
	@Then("The system should display the data mandatory message")
	public void the_system_should_display_the_data_mandatory_message() {
		assertTrue(page.msgBlockExist());
	}

}
