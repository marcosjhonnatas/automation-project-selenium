package pages;

public class ProductPage extends BasePage {
	
	public String returnTextTabProduct() {
		return getVisibleElementById("enterproductdata")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");
	}
	
	public void clickInProductTab() {
		getClickableElementById("enterproductdata").click();
	}
	
	public void insertStartDate(String date) {
		getVisibleElementById("startdate").sendKeys(date);
	}
	
	public void selectInsuranceSum(String text) {
		selectInComboById("insurancesum", text);
	}
	
	public void selectMeritRating(String text){
		selectInComboById("meritrating", text);
	}
	
	public void selectDamageinsurance(String text){
		selectInComboById("damageinsurance", text);
	}
	
	public void selectOptionalProductEuroProtection() {
		actionById("EuroProtection").click().perform();
	}
	
	public void selectCourtesyCar(String text) {
		selectInComboById("courtesycar", text);
	}
		
}
