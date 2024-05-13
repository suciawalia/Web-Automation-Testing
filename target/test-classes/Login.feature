Feature: User Login

    Scenario: User successfully logs in with registered username and password
        Given I am on the login page
        When I fill in the username "standard_user" and password "secret_sauce"
        And I click the login button
        Then I have logged in successfully

    Scenario: Validate Password Matching with Username
        Given I am on the login page
        When I fill in the username "performance_glitch_user" and password "secret_sauce"
        And I click the login button
        Then I have logged in successfully