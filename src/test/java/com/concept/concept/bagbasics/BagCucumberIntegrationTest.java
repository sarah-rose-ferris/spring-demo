package com.concept.concept.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/integration.json"},
        extraGlue = "com.concept.concept.bagcommons")
public class BagCucumberIntegrationTest {
}
