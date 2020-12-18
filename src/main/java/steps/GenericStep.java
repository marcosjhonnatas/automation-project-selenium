package steps;

import org.openqa.selenium.Dimension;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericStep {
	
	public static WebDriver driver;
	public GenericStep() {}
	
	public static WebDriver getDriver() {	
		if (driver == null) {		
			return driver = new ChromeDriver();		
		}	
		driver.manage().window().setSize(new Dimension(800, 700));	
		return driver;	
	}
	
	public static String returnActualDate() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   String actualDate = dtf.format(now).toString();
		   System.out.println(actualDate);
		return null;  
	}
	
	@Before
	public void start() {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@After
	public static void KillDriver() {
		driver.quit();
	}
	
}
