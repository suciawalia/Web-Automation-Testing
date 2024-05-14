package com.testswaglabs.stepdefinition;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    WebDriver driver;

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("I am on the login page")
    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I fill in the username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click the login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I have logged in successfully")
    public void verifyLoggedInSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/inventory.html"));
    }

    @Then("I should see the error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        String actualErrorMessage = driver.findElement(By.cssSelector(".error-message-container.error")).getText();
        assertEquals(errorMessage, actualErrorMessage);
    }

    @Then("The current screen is still on the login page")
    public void currentScreenLogin() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
    }
    
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
