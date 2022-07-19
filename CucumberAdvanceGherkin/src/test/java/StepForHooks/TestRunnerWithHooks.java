package StepForHooks;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/hooksInBDD.feature",glue={"StepForHooks"},
monochrome=true,
plugin= {"pretty","html:Reports/HtmlReport/html1",
		"json:Reports/JsonReport/cucumber.json",
		"junit:Reports/JunitReport/report.xml"})


public class TestRunnerWithHooks {

}
