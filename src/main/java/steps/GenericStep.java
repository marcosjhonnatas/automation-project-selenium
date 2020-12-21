package steps;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericStep {
	
	public static WebDriver driver;
	public GenericStep() {}
	
	public static WebDriver getDriver() {	
		if (driver == null) {		
			driver = new ChromeDriver();			
		}	
		driver.manage().window().setSize(new Dimension(800, 700));	
		return driver;	
	}
	
	public static String returnActualDate() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
	   return dtf.format(now).toString();
	}
	
	public static String sumYersInActualDate(int years) {
			Date actualdate = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(actualdate);
			calendar.add( Calendar.YEAR,years);
			Date date = calendar.getTime();
			SimpleDateFormat frmt = new SimpleDateFormat("MM/dd/yyyy");
		return frmt.format(date); 
	}
	
	@Before
	public void start() {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@After
	public static void KillDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
