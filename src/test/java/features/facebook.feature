Feature: Sign up Facebook


  @Facebook @Birsen
  Scenario Outline: Create a new user facebookaccount following registration process
    Given User launch chrome browser
    When User opens URL "https://www.facebook.com/"
    #Then User navigates to FacebookFacePage
    And User enters email as "<email>" and password as "<password>"
    And User clicks on createnewaccount
    And User enters credentials firstname as  "<firstname>" and lastname as "<lastname>" and phonenumber as "<phonenumber>" and newpassword as "<newpassword>"
    And User selects <month> from monthdropdownmenu
    And User selects <day> from daydropdownmenu
    And User selects <year> from yeardropdownmenu
    And User clicks on female
    When User completes the signUp by clicking signUpbutton
    Then Close the browser

    Examples:
      |email         |password |firstname|lastname |phonenumber|newpassword|month   |day  |year|
      |ayse@gmail.com|123AyseT.|ayse     |tester   |1234567890 |123AyseT.  |January |1    |2005|