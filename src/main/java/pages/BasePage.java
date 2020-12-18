package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.GenericStep;


public class BasePage {
	
	public WebElement getElementById(String id) {	
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));	
		return element;
	}	
	
	public void clickActionById(String id) {	
		WebElement element = GenericStep.getDriver().findElement(By.id(id));
		Actions actions = new Actions(GenericStep.getDriver());
		actions.moveToElement(element).click().perform();	
	}	

	public WebElement getElementByText(String text) {
		WebElement element = GenericStep.getDriver().findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
		return element;
	}
	
	
	public WebElement getElementByName(String name) {
		WebElement element = GenericStep.getDriver().findElement(By.name(name));
		return element;
	}
	
	public WebElement getElementByXpath(String xpath) {
		WebElement element = GenericStep.getDriver().findElement(By.xpath(xpath));
		return element;
	}
	
	public void selectInCombo(String id, String text) {
		WebDriverWait wait = new WebDriverWait(GenericStep.getDriver(), 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));		
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
	}

}
