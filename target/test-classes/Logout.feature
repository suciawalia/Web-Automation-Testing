Feature: User Logout

    @TC0.1.1
    Scenario: User successfully logs out
        Given I have successfully logged in
        And I have clicked the menu button
        When I click the logout button
        Then I have logged out successfully