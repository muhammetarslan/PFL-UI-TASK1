@numbersequencefinder
Feature: Number sequence tests with data-driven scenario

  @scenario_outline
  Scenario Outline: Number sequence tests for <input>
    When user navigates to NumberSequenceFinder page
    Then user should see the headline Number Sequence Finder
    When user inputs "<input>"
    Then result should be "<result>"

    Examples: input and results
      | input     | result                                                             |
      | 1 2 3     | True: The text does contain the integers 1 2 3 in this order.      |
      | 1aa2b3    | True: The text does contain the integers 1 2 3 in this order.      |
      | 1\|2\|3   | True: The text does contain the integers 1 2 3 in this order.      |
      | 1,2,3     | True: The text does contain the integers 1 2 3 in this order.      |
      | 123       | True: The text does contain the integers 1 2 3 in this order.      |
      | 1 1 2 1 3 | True: The text does contain the integers 1 2 3 in this order.      |
      | 1a2       | False: The text does not contain the integers 1 2 3 in this order. |
      | ads       | False: The text does not contain the integers 1 2 3 in this order. |
      | 3 2 1     | False: The text does not contain the integers 1 2 3 in this order. |
      |           | Please provide a string.                                           |