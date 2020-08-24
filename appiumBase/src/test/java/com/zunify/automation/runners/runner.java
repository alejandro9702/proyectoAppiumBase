package com.zunify.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba_appium.feature",
        glue = {"com/zunify/automation/stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@appium"
)
public class runner {
}
