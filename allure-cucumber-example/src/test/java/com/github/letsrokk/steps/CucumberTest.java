package com.github.letsrokk.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/resources/features/example.feature"},
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm", "pretty", "json:target/cucumber-report/report.json"},
        glue = {"com.github.letsrokk.steps"})
public class CucumberTest {
}
