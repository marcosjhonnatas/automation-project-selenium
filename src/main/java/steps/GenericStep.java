package steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericStep {
	
	private static WebDriver driver;
	private GenericStep() {}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			
			driver = new ChromeDriver();
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
	
	@After
	public void start() {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@Before
	public void end() {
		KillDriver();
	}

}
