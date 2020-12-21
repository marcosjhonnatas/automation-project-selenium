package pages;

public class PricePage extends BasePage{
	
	public String returnTextTabPrice() {
		return getVisibleElementById("selectpriceoption")
				.getText()
				.replaceAll("[^A-Za-z- ]", "");	 		
	}
	
	public void selectPriceSilver() {
		actionById("selectsilver").click().perform();
	}
	
	public void selectPriceGOld() {
		actionById("selectgold").click().perform();
	}
	
	public void selectPricePlatinum() {
		actionById("selectplatinum").click().perform();
	}
	
	public void selectPriceUltimate() {
		actionById("selectultimate").click().perform();
	}
	
}
