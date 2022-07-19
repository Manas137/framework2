package StepsForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/backgroundDemo.feature",glue={"abcd"},
monochrome=true,
plugin= {"pretty","html:Reports/HtmlReport/html1",
		"json:Reports/JsonReport/cucumber.json",
		"junit:Reports/JunitReport/report.xml"})

public class testRunnerBackground {

}
