@VechicleRegistrationEnquiry
Feature: To test and validate vechile make and colour
  Scenario: Verify vehicle color, make and match to expected value in DVLA site to the values in test date
    Given I scan the directory to retrieve supported "xlsx" files
    And I read vehicle reg numbers from files
    And I launch DVLA site
    When I search for vehicle info by reg number
    Then I should be able match the expected color and make of the vehicle from the given file

  Scenario: Verify vehicle color, make match to expected value in DVLA site to the values in test data from respective CSV file
    Given I scan the directory to retrieve supported "csv" files
    And I read vehicle reg numbers from files
    And I launch DVLA site
    When I search for vehicle info by reg number
    Then I should be able match the expected color and make of the vehicle from the given file