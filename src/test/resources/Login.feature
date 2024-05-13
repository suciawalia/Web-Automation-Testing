Feature: User Login

    Scenario: User successfully logs in with registered username and password
        Given I am on the login page
        When I fill in the username "standard_user" and password "secret_sauce"
        And I click the login button
        Then I have logged in successfully

    Scenario: User attempts to login without providing username and password
        Given I am on the login page
        When I attempt to login without providing username and password
        And I should remain on the login page
        Then I should see the error message "You need Username & Password!"
