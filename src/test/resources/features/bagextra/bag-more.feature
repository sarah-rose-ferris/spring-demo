Feature: Bag more functionalities

  @TestCaseKey=TS-T18
  Scenario: Putting one thing in the bag
    Given the bag is not empty
    When I empty the bag
    Then the bag is empty
