package pages;

public class VehicleDataPage extends BasePage {

	public void selectValidMake(String text) {
		selectInCombo("make", text);
	}
	public void selecTModel(String text) {
		selectInCombo("model", text);
	}
	public void sendCylinderCapacity(String text) {
		getElementById("cylindercapacity").sendKeys(text);
	}
	public void sendEnginePerformance(String text) {
		getElementById("engineperformance").sendKeys(text);
	}
	public void sendDateOfManufacture(String text) {
		getElementById("dateofmanufacture").sendKeys(text);
	}
	
	public void selectNumberOfCycles(String qtd) {
		selectInCombo("numberofseats", "3");
	}
	public void selectYesRightHandDrive() {
		clickActionById("righthanddriveyes");
	}
	
	public void selectNumberOfSeatMotorCycle(String qtd) {
		selectInCombo("numberofseatsmotorcycle", qtd);
	}
	public void selectFuel(String fuel) {
		selectInCombo("fuel", fuel);
	}
	
	public void sendPlayLoad(String qtd) {
		getElementById("payload").sendKeys(qtd);
	}
	
	public void sendTotalWeight(String qtd) {
		getElementById("totalweight").sendKeys(qtd);
	}
	public void sendListPrice(String qtd) {
		getElementById("listprice").sendKeys(qtd);	
	}
	public void sendLicensePlatenumber(String qtd) {
		getElementById("licenseplatenumber").sendKeys(qtd);	
	}
	public void sendAnnualmileage(String qtd) {
		getElementById("annualmileage").sendKeys(qtd);	
	}
	
	public void clickInNextButton() {
		InsurantDataPage page = new InsurantDataPage();
		if (returnTextAbaSelected() == returnTextAbaVehicle()) {
			getElementById("nextenterinsurantdata").click();
		}
		else if(returnTextAbaSelected() == page.returnTextAbaInsurant()) {
			getElementById("nextenterproductdata").click();
		}
	}

	public String returnTextAbaSelected() {	
		String text = getElementByXpath("//li[@class='idealsteps-step-active']/a").getText();
		return text.replace("[]", "");	
	}
	
	public String returnTextAbaVehicle() {
		String text = getElementById("entervehicledata").getText();
		return text;		
	}

}
