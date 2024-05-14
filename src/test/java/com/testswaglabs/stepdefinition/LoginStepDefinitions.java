package com.testswaglabs.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @When("I fill in the password {string} without providing username")
    public void enterPasswordOnly(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I fill in the username {string} without providing password")
    public void enterUsernameOnly(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @Then("I have logged in successfully")
    public void verifyLoggedInSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/inventory.html"));
    }
    
    @When("I attempt to login without providing username and password")
    public void attemptLoginWithoutCredentials() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should remain on the login page")
    public void verifyRemainOnLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
    }

    @Then("I should see the error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        String actualErrorMessage = driver.findElement(By.cssSelector(".error-message-container.error")).getText();
        System.out.println("Expected error message: " + errorMessage);
        System.out.println("Actual error message: " + actualErrorMessage);
        assertEquals(errorMessage, actualErrorMessage);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
