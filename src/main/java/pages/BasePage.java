package pages;

import org.openqa.selenium.By;

import steps.GenericStep;

public class BasePage {
	
	public void clickById(String id) {
		GenericStep.getDriver().findElement(By.id(id)).click();
	}
	public void clickByText(String text) {
		GenericStep.getDriver().findElement(By.xpath("//*[contains(text(),'"+text+"')]")).click();
	}
	
	public void sendBy(String id, String value) {
		GenericStep.getDriver().findElement(By.id(id)).sendKeys(value);
	}
	
	public void selectByXpathAndPosition(String xpath, int position) {
		GenericStep.getDriver().findElement(By.id(xpath)).click();
	}

}
