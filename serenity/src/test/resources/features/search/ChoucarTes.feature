Feature: Search choucar job and verify title

  @suite1
  Scenario: Searching for a term
    Given User is on  home page
    When user entry to job first
    Then user verify all and title

  @suite2
  Scenario: Option second for entry choucar job
    Given User entry home page
    When user entry to job second method
    Then user sends place

