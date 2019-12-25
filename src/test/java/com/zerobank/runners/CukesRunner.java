package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)

    @CucumberOptions (
            features = {"src/test/resources/features"},
            glue = {"/com/zerobank/step_definitions"},
            plugin = {"pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json"},
            monochrome = true,
            dryRun = false,
            tags = "@accountSummary3"
    )

    public class CukesRunner {

    }

