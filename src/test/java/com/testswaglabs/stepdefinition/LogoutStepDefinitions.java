package com.testswaglabs.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.testswaglabs.pages.DashboardPage;
import com.testswaglabs.pages.LoginPage;
import com.testswaglabs.utils.DriverManager;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LogoutStepDefinitions {
    
    private WebDriver driver = null;
    private LoginPage login;
    private DashboardPage dashboard;

    private String username = "standard_user";
    private String password = "secret_sauce";
    private String loginPage = "https://www.saucedemo.com/";
    private String dashboardPage = "https://www.saucedemo.com/inventory.html";

    @Before
    public void setup(){
        driver = DriverManager.getDriver();
        login = new LoginPage(driver);
        dashboard = new DashboardPage(driver);
    }

    @Given("I have successfully logged in")
    public void verifyLoggedInSuccessfully() {
        driver.get(loginPage);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(dashboardPage));
    }

    @And("I have clicked the menu button")
    public void clickMenuButton() {
        dashboard.clickMenu();
    }

    @When("I click the logout button")
    public void clickLogutButton() {
        dashboard.clickLogout();
    }

    @Then("I have logged out successfully")
    public void verifyLoggedOutSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(loginPage));
    }
    
    @After
    public void closeBrowser() {
        DriverManager.quitDriver();
    }
}
