package pages;

public class InsurantPage extends BasePage{
	
	public String returnTextAbaInsurant() {
		return getVisibleElementById("enterinsurantdata")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");		
	}
	
	public void clickInTabInsurant() {
		getClickableElementById("enterinsurantdata").click();
	}
	
	public void insertFirstName(String name) {
		getVisibleElementById("firstname").sendKeys(name);
	}
	
	public void insertLastName(String lastname) {
		getVisibleElementById("lastname").sendKeys(lastname);
	}
	
	public void insertBirthdate(String birthdate) {
		getVisibleElementById("birthdate").sendKeys(birthdate);
	}
	
	public void selectGenderMale() {
		actionById("gendermale").click().perform();
	}
	
	public void insertStreetaddress(String streetaddress) {
		getVisibleElementById("streetaddress").sendKeys(streetaddress);
	}
	
	public void selectCountry(String country){
		selectInComboById("country", country);
	}
	
	public void sendZipcode(String zipcode){
		getVisibleElementById("zipcode").sendKeys(zipcode);
	}
	
	public void sendCity(String city){
		getVisibleElementById("city").sendKeys(city);
	}
	
	public void selectOccupation(String occupation){
		selectInComboById("occupation", occupation);
	}
	
	public void selectHobbeSpeeding() {
		actionById("speeding").click().perform();
	}
	
	public void insertWebsite(String website){
		getVisibleElementById("website").sendKeys(website);
	}
	
	public void clickInOpenButton(){
		getClickableElementById("open").click();
	}

}
