# new feature
# Tags: optional

Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $100 in my wallet
    When I request $130
    Then $130 shouldn't be dispensed