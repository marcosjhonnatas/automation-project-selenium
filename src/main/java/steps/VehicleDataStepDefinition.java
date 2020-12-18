package steps;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurantDataPage;
import pages.VehicleDataPage;

public class VehicleDataStepDefinition {
		
	VehicleDataPage page = new VehicleDataPage();
	
	@Given("that I am on the vehicle form")
	public void that_i_am_on_the_vehicle_form() {
		assertEquals(page.returnTextAbaSelected(), page.returnTextAbaVehicle());
	}

	@When("I fill in the valid data")
	public void i_fill_in_the_valid_data() {
		page.selectValidMake("Ford");
		page.selecTModel("Scooter");
		page.sendCylinderCapacity("1500");
		page.sendEnginePerformance("2000");
		page.sendDateOfManufacture(GenericStep.returnActualDate());
		page.selectNumberOfSeatMotorCycle("3");
		page.selectYesRightHandDrive();
		page.selectNumberOfCycles("2");
		page.selectFuel("Diesel");
		page.sendPlayLoad("300");
		page.sendTotalWeight("400");
		page.sendListPrice("600");
		page.sendLicensePlatenumber("3000");
		page.sendAnnualmileage("4000");	
	}

	@And("click next")
	public void click_next() {
		page.clickInNextButton();
	}

	@Then("the system should redirect to the Enter Insurant Data tab")
	public void the_system_should_redirect_to_the_enter_insurant_data_tab() {
		InsurantDataPage ins = new InsurantDataPage();
		assertEquals(page.returnTextAbaSelected(), ins.returnTextAbaInsurant());
	}
	

}
