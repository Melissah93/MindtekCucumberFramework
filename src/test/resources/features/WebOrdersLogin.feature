Feature: WebOrders application login feature

  Scenario: Validating login feature with valid credentials
    #before
    Given user navigates to WebOrders application
    When user enters username "Tester" and password "test" and clicks on login button
    Then user validates application is logged in
    #after