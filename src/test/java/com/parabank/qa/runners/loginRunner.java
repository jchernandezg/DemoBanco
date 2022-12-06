package com.parabank.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/login.feature"},
        glue = {"com.parabank.qa.stepsDefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@login"
)

public class loginRunner {
}
