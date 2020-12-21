package steps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurantPage;
import pages.VehiclePage;

public class VehicleStepDefinition {
		
	VehiclePage page = new VehiclePage();
	
	@Given("that I am on the vehicle form")
	public void that_i_am_on_the_vehicle_form() {
		assertTrue(page.returnTextTabSelected().contains(page.returnTextAbaVehicle()));
	}

	@When("I fill in the valid data of vehicle")
	public void i_fill_in_the_valid_data() {
		page.selectValidMake("Ford");
		page.selecTModel("Scooter");
		page.insertCylinderCapacity("1500");
		page.insertEnginePerformance("2000");
		page.insertDateOfManufacture(GenericStep.returnActualDate());
		page.selectYesRightHandDrive();
		page.selectNumberOfSeatMotorCycle("3");
		page.selectNumberOfCycles("2");
		page.selectFuel("Diesel");
		page.insertPlayLoad("300");
		page.insertTotalWeight("400");
		page.insertListPrice("600");
		page.insertLicensePlatenumber("3000");
		page.insertAnnualmileage("4000");	
	}

	@And("click next")
	public void click_next() {
		page.clickInNextButton();
	}

	@Then("the system should redirect to the Enter Insurant Data tab")
	public void the_system_should_redirect_to_the_enter_insurant_data_tab() {
		InsurantPage ins = new InsurantPage();
		assertEquals(page.returnTextTabSelected(), ins.returnTextAbaInsurant());
	}
	

}
