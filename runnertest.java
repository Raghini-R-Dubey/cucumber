package stepdefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepdefinitions"}, monochrome= true,
	plugin={"pretty","junit:target/JUnitReports/reports.xml",
			"json:target/JSONReports/reports.json",
			"html:target/HtmlReports/reports.html"},
	tags="@smoketest")

	public class runnertest {

	}

