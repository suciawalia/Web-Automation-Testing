package com.testswaglabs.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@focus", features="src/test/resources",
        glue= {"com.testswaglabs.stepdefinition"},
        plugin ={"pretty","json:target/cucumber.json"})
public class TestLoginLogout {
}

