Feature: Sendkeys AuotomationTest


  @sendKeys
  Scenario Outline: As a user, I want to enter credentials
    Given I am on the AutomationPracticePage homepage
    When I enter credentials as <firstname>, <lastname>, <phone>, and <country>
    Examples:
      | firstname | lastname | phone | country       |
      | John      | Muro     | apple | United Stades |