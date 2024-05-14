package com.testswaglabs.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutStepDefinitions {
    WebDriver driver;

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("I have successfully logged in")
    public void verifyLoggedInSuccessfully() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/inventory.html"));
    }

    @Given("I have clicked the menu button")
    public void clickMenuButton() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @When("I click the logout button")
    public void clickLogutButton() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("I have logged out successfully")
    public void verifyLoggedOutSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
    }
    
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
