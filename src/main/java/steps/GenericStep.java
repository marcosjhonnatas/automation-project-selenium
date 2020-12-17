package steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericStep {
	
	private static WebDriver driver;
	private GenericStep() {}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			
			driver = new FirefoxDriver();
			driver.manage().window().setSize(new Dimension(1200, 700));
		}
		return driver;
		
	}
	
	public static void KillDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;	
		}
	}

	public void start() {
		
	}

}
