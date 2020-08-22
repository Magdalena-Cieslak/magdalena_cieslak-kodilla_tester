# new feature
# Tags: optional

Feature: Is number divisible?

  Scenario: The number is divisible by 3
    Given the number is 6
    When I ask number it's divisible by 3
    Then "Fizz"

  Scenario: The number is divisible by 5
    Given the number is 10
    When I ask number it's divisible by 5
    Then "Buzz"

  Scenario: The number is divisible by 3 and by 5
    Given the number is 15
    When I ask number it's divisible by 3 and by 5
    Then "FizzBuzz"

  Scenario: The number isn't divisible by 3 and by 5
    Given the number is 4
    When I ask number it's divisible by 3 and by 5
    Then "None"