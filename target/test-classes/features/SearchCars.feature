@Search-Cars
Feature: Testing whether search cars options works successfully

  Scenario: Validate Search Cars option
    Given enter the url of the homepage carsguide.com.au as "https://www.carsguide.com.au/"
    When I  move to the available menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And Select "Search Cars" from the options
    And Select car brans as "BMW" from AnyMakeDropdown
    And Select car model "1 Series" from AnyModelDropdown
    And Select location as "NSW - Hunter" from LocationDropdown
    And Select "$20,000" from MaxPriceDropdown
    And click FindMyNextCarBtn
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 20000 for Sale Hunter NSW | carsguide"
