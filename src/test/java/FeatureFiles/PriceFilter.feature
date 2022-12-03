
Feature: Price Filter Functionality

  Scenario: After going to the Buy page, I should be able to see the houses with the price in the range I have determined, using the price filter.

    Given Navigate to Zillow
    When Click on the element in the Header Content
    | buyButton |
    | priceFilterButton |
    | option100kMin |
    | price600kMax |
