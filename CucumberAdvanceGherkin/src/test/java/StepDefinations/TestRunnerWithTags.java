package StepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/tagsInBDD.feature",glue={"StepDefinations"},
monochrome=true,
tags = "@Regression or ~@Smoke",
plugin= {"pretty","html:Reports/HtmlReport/html1",
		"json:Reports/JsonReport/cucumber.json",
		"junit:Reports/JunitReport/report.xml"})


public class TestRunnerWithTags {

}
