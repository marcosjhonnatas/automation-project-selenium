package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.GenericStep;


public class BasePage {

	//---------------GENERIC METHODS-------------------//

	public WebElement getVisibleElementById(String id) {	
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		return wait.until(ExpectedConditions.visibilityOf(GenericStep.getDriver().findElement(By.id(id))));	
	}	
	
	public WebElement getClickableElementById(String id) {	
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		return wait.until(ExpectedConditions.elementToBeClickable((By.id(id))));	
	}
	
	public Actions actionById(String id) {	
		WebElement element = GenericStep.getDriver().findElement(By.id(id));
		Actions actions = new Actions(GenericStep.getDriver());
		return actions.moveToElement(element);	
	}	

	public WebElement getElementByText(String text) {
		return GenericStep.getDriver().findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
	}
	
	public WebElement getElementByName(String name) {
		return GenericStep.getDriver().findElement(By.name(name));
	}
	
	public WebElement getElementByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));		
	}
	
	public void selectInComboById(String id, String text) {
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));		
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
	}
	
	//---------------GENERIC ELEMENTS-------------------//
	
	public void clickInNextButton() {
	
		switch (returnTextTabSelected()) {
		case "Enter Vehicle Data":
			getVisibleElementById("nextenterinsurantdata").click();
			break;
		case "Enter Insurant Data":
			getVisibleElementById("nextenterproductdata").click();
			break;
		case "Enter Product Data":
			getVisibleElementById("nextselectpriceoption").click();
			break;
		case "Select Price Option":
			getVisibleElementById("nextsendquote").click();
			break;
		}
		
	}

	public String returnTextTabSelected() {	
		return getElementByXpath("//li[@class='idealsteps-step-active']/a")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");		
	}
	
	public Boolean msgBlockExist() {
		if (getElementByXpath("//*[@id='xLoaderPrice']/p")
				.getText()
				.contains("Please, complete the first three steps to see the price table.")) {
			return true;
		}else {
			return false;
		}	
	}
}
