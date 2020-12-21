package pages;

public class VehiclePage extends BasePage {

	public String returnTextAbaVehicle() {
		return getVisibleElementById("entervehicledata")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");		
	}

	
	public void selectValidMake(String text) {
		selectInComboById("make", text);
	}
	
	public void selecTModel(String text) {
		selectInComboById("model", text);
	}
	
	public void insertCylinderCapacity(String text) {
		getVisibleElementById("cylindercapacity").sendKeys(text);
	}
	
	public void insertEnginePerformance(String text) {
		getVisibleElementById("engineperformance").sendKeys(text);
	}
	
	public void insertDateOfManufacture(String text) {
		getVisibleElementById("dateofmanufacture").sendKeys(text);
	}
	
	public void selectNumberOfCycles(String qtd) {
		selectInComboById("numberofseats", "3");
	}
	
	public void selectYesRightHandDrive() {
		actionById("righthanddriveyes").click().perform();
	}
	
	public void selectNumberOfSeatMotorCycle(String qtd) {
		selectInComboById("numberofseatsmotorcycle", qtd);
	}
	
	public void selectFuel(String fuel) {
		selectInComboById("fuel", fuel);
	}
	
	public void insertPlayLoad(String qtd) {
		getVisibleElementById("payload").sendKeys(qtd);
	}
	
	public void insertTotalWeight(String qtd) {
		getVisibleElementById("totalweight").sendKeys(qtd);
	}
	
	public void insertListPrice(String qtd) {
		getVisibleElementById("listprice").sendKeys(qtd);	
	}
	
	public void insertLicensePlatenumber(String qtd) {
		getVisibleElementById("licenseplatenumber").sendKeys(qtd);	
	}
	
	public void insertAnnualmileage(String qtd) {
		getVisibleElementById("annualmileage").sendKeys(qtd);	
	}
	
}
