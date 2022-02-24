Feature: GeneralTests

  @localtest
  Scenario: Search a product
      Given the user searches for product "Allux Brievenbus 600 Zwart"
      Then the search result page is correct