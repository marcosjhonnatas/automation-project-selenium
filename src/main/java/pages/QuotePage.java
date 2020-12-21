package pages;

public class QuotePage extends BasePage{
	public String returnTextTabQuote() {
		return getVisibleElementById("sendquote")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");	 		
	}
	
	public void insertEmail(String email) {
		getVisibleElementById("email").sendKeys(email);
	}
	
	public void insertUserName(String username) {
		getVisibleElementById("username").sendKeys(username);
	}
	
	public void insertPassword(String pass) {
		getVisibleElementById("password").sendKeys(pass);
	}
	
	public void inserConfirmPassword(String cmp) {
		getVisibleElementById("confirmpassword").sendKeys(cmp);
	}
	
	public String returnTextSuccessMessage() {
		return getElementByXpath("//h2").getText();
	}
	
	public void clickInSendEmailButton() {
		getClickableElementById("sendemail").click();
	}
	
}
