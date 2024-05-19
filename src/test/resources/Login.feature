Feature: User Login

    @TC0.0.1
    Scenario: User successfully logs in with registered username and password
        Given I am on the login page
        When I fill in the username "standard_user"
        And I fill in the password "secret_sauce"
        And I click the login button
        Then I have logged in successfully

    @TC0.0.2
    Scenario: User attempts to login without providing username and password
        Given I am on the login page
        When I fill in the username ""
        And I fill in the username ""
        And I click the login button
        And I should remain on the login page
        Then I should see the error message "You need Username & Password!"

    @TC0.0.3
    Scenario: User attempts to login without providing username
        Given I am on the login page
        When I fill in the password "secret_sauce"
        And I click the login button
        Then I should remain on the login page
        And I should see the error message "You need Username !"

    @TC0.0.4  
    Scenario: User attempts to login without providing password
        Given I am on the login page
        When I fill in the username "standard_user"
        And I click the login button
        Then I should remain on the login page
        And I should see the error message "You need Password !"
    
    @TC0.0.5
    Scenario: Username isn't registered in the system
        Given I am on the login page
        When I fill in the username "standa_user"
        And I fill in the password "secret_sauce"
        And I click the login button
        Then I should see the error message "Username and password do not match any user in this service !"
        And I should remain on the login page
    
    @TC0.0.6
    Scenario: Password isn't registered in the system
        Given I am on the login page
        When I fill in the username "standard_user"
        And I fill in the password "secret_sauc"
        And I click the login button
        Then I should remain on the login page
        And I should see the error message "Username and password do not match any user in this service !"