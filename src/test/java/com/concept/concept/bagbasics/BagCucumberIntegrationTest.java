package com.concept.concept.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics"
        ,extraGlue = "com.concept.concept.bagcommons"
        ,plugin = {"pretty","html:target/html", "json:target/cucumber.json"})
public class BagCucumberIntegrationTest {
}

//classpath:features"