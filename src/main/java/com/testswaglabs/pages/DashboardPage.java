package com.testswaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id="logout_sidebar_link")
    private WebElement logoutButton;

    public void clickMenu() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

}
