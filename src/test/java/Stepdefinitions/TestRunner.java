package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"Stepdefinitions"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports/index.html", 
		"json:target/JsonReports/report.json",
		"junit:target/JUnitReports/report.xml"}
//tags="@SmokeTest"
)

public class TestRunner {

}