package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},
	features = {"src/main/resources/features/insurantData.feature"},
	snippets = SnippetType.CAMELCASE,
	monochrome = true,
	glue = "steps")

public class DataVehicleRunner {

}
