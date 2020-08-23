# new feature
# Tags: optional

Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $100 in my wallet
    When I request $130
    Then $130 shouldn't be dispensed

  Scenario: User tries to take out more money than their wallet contains
    Given there is $100 in my wallet
    When I withdraw $200
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet