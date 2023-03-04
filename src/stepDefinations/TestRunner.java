package stepDefinations;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;



@RunWith((Class<? extends Runner>) CucumberOptions.class)
@CucumberOptions(features="D:\\acceleration\\Workspace\\FEB_17_CUCUMBER\\src\\test\\resources\\org\\features\\loginpage.feature", 
glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"}
		)
public class TestRunner {

}

	