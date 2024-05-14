Feature: User Login and Login

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

    Scenario: Username or password isn't registered in the system
        Given I am on the login page
        When I fill in the username "standa_user" and password "secret_sauce"
        And I click the login button
        Then I should see the error message "Username and password do not match any user in this service !"
        And The current screen is still on the login page

    Scenario: Username or password isn't registered in the system
        Given I am on the login page
        When I fill in the username "standard_user" and password "secret_sauc"
        And I click the login button
        Then The current screen is still on the login page
        And I should see the error message "Username and password do not match any user in this service !"