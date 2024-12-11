package com.bdb.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "rerun:target/rerun.txt", "json:target/destination/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"com.bdb.stepdefinitions"},
        tags = "@EcommerceProduction")

public class TestRunnerProduction {
}
