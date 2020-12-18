package pages;

public class InsurantDataPage extends BasePage{
	
	public String returnTextAbaInsurant() {
		String text = getElementById("enterinsurantdata").getText();
		return text;		
	}
	public void clickInTabInsurant() {
		 getElementById("enterinsurantdata").click();
	}
	public void sendFirstName(String name) {
		getElementById("firstname").sendKeys(name);
	}
	
	public void sendLastName(String lastname) {
		getElementById("lastname").sendKeys(lastname);
	}
	
	public void sendBirthdate(String birthdate) {
		getElementById("birthdate").sendKeys(birthdate);
	}
	
	public void selectGenderMale() {
		clickActionById("gendermale");
	}
	
	public void sendStreetaddress(String streetaddress) {
		getElementById("streetaddress").sendKeys(streetaddress);
	}
	
	public void selectCountry(String country){
		selectInCombo("country", country);
	}
	
	public void sendZipcode(String zipcode){
		getElementById("zipcode").sendKeys(zipcode);
	}
	
	public void sendCity(String city){
		getElementById("city").sendKeys(city);
	}
	
	public void selectOccupation(String occupation){
		selectInCombo("occupation", occupation);
	}
	//---------------HOBBIES
	
	public void selectHobbeSpeeding() {
		clickActionById("speeding");
//		getElementById("").click();
	}
	
	
	public void sendWebsite(String website){
		getElementById("website").sendKeys(website);
	}
	
	public void clickInOpenButton(){
		getElementById("open").click();
	}

}
