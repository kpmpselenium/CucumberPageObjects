@Used-Car-Search
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Used Search Cars page is working
  Performing the Acceptance Testing

  @Used-Car-SearchPositive
  Scenario: Validate Used Search Cars Page
    Given I navigate to the  Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to buyandsell Menu
    And click on submenu Used Cars Search link
    And select carMaker from AnyMake dropdown in Used Cars Search page
      | carMaker |
      | Audi    |
    And select  carModel from AnyModel dropdown in Used Cars Search page
      | carModel |
      | A4       |
    And select location  from SelectLocation dropdown in Used Cars Search page
      | location 	   |
      | NSW - Hunter |
    And select price from maxprice dropdown in Used Cars Search page
      | price  |
      | $10,000 |
    And click on Find_My_Car button in Used Cars Search page
    Then I should see list of Used cars
    And the page title should match expected title  "Used Audi A4 Under 10000 for Sale Hunter NSW | carsguide"
