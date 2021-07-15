package com.cas.runner.cucumbertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com/cas/glue/stepdefinition" }, plugin = { "pretty",
		"html:target/HTMLReports/report.html", "json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml" })
public class Runner {
}
