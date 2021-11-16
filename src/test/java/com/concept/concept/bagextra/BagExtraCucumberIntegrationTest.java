package com.concept.concept.bagextra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/bagextra"
        ,extraGlue = "com.concept.concept.bagcommons"
        ,plugin = { "pretty", "json:target/cucumber-reports/bagextra.json"}
)
public class BagExtraCucumberIntegrationTest {

}
