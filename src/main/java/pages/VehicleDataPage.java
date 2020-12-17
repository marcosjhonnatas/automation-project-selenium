package pages;

public class VehicleDataPage extends BasePage {
	
	
	//select[@id='']
	
	public void selectValidMake(String make) {
		clickById("make");
		clickByText(make);
		selectByXpathAndPosition(null, 0);
	}

}
