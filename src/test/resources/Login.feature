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

    Scenario: User attempts to login without providing username and password
        Given I am on the login page
        When I attempt to login without providing username and password
        And I should remain on the login page
        Then I should see the error message "You need Username & Password!"
    
    Scenario: User attempts to login without providing username
        Given I am on the login page
        When I fill in the password "secret_sauce" without providing username
        And I click the login button
        Then I should remain on the login page
        And I should see the error message "You need Username !"